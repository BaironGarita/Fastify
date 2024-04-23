/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDatos;

import LogicaNegocio.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class UsuarioBD {
    private final String RUTA_ARCHIVO = System.getProperty("user.dir")+ "\\src\\Archivo\\Usuario.dat";
    private FileOutputStream archivoSalida;
    private ObjectOutputStream oEscritor;
    private FileInputStream archivoEntrada;
    private ObjectInputStream oLector;
    private ArrayList<Usuario> arrayUsuariosTemp;
    //Instancia privada de la misma clase
    //implementa el patrón Singleton
    private static UsuarioBD instance = null;

    //Constructor privado, se implementa el patrón Singleton
    private UsuarioBD() {
       
    }

    //Método público que retorna una única instancia de la 
    //clase, únicamnete se construye la primera vez.
    public static UsuarioBD getInstance() {
        if (instance == null) {
            instance = new UsuarioBD();
        }
        return instance;
    }

    //OJO: este tipo de comentario genera la ayuda del método
    /**
     * Abre el archivo de datos, para escritura (de tipo output)
     * Tipo de Archivo: Secuencial. Lanza la Exception al
     * nivel donde fue llamado
     * @throws java.lang.Exception
     * @param
     */
    public void abrirArchivoOutput() throws Exception { //para grabar en él
        //Abrir el archivo y colocarse al final del archivo
        try {
            File oArchivo = new File(RUTA_ARCHIVO);
            if (!oArchivo.exists()) { //Si el archivo no existe
                //Abrir el archivo de Acceso Secuencial para  escritura
                //La primera vez incluye la cabecera del archivo
                //true indica que se agregarán registros al final            
                archivoSalida = new FileOutputStream(RUTA_ARCHIVO, true);
                oEscritor = new ObjectOutputStream(archivoSalida); //escribe los encabezados la primera vez que graba
            } 
            else { //Si el archivo ya existe en disco
                //Abrir el archivo de Acceso Secuencial para  escritura
                //La primera vez incluye la cabecera del archivo
                archivoSalida = new FileOutputStream(RUTA_ARCHIVO, true);
                oEscritor = new MiObjectOutputStream(archivoSalida);
            }
        } catch (IOException e) {
            throw e; //Se lanza al método que invocó al método en que estoy
        }
    }

    /**
     * Abre  el archivo de datos, para lectura (de tipo input) El
     * apuntador del archivo se coloca al inicio del archivo 
     * Tipo de Archivo: Secuencial.
     * @throws java.lang.Exception
     * @param
     */
    public void abrirArchivoInput() throws Exception { //para leer del archivo
        //Abrir el archivo y colocarse al inicio del mismo
        try {
            archivoEntrada = new FileInputStream(RUTA_ARCHIVO);
            oLector = new ObjectInputStream(archivoEntrada);
        } catch (IOException e) {
            throw e;
        }
    }

   
    public void cerrarArchivoOutput() throws Exception {
        try {
            if (oEscritor != null) {
                oEscritor.close();
                oEscritor = null;
            }
        } catch (IOException e) {
            throw e;
        }
    }
    
     /**
     * Permite cerrar el archivo de datos que se abrió para lectura
     */
    private void cerrarArchivoInput() throws Exception {
        try {
            if (oLector != null) {
                oLector.close();
                oLector = null;
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /**
     * Lista de todos los Departamentos que se encuentran en el archivo
     * @return ArrayList
     * @throws java.lang.Exception
     */
     public ArrayList<Usuario> lista() throws Exception{
        ArrayList listaUsuario= new ArrayList();
        //Ya que habrá bloque finally se debe encerrar el bloque try
        //el throws del encabezado lanza la excepción del finally      
      try {         
            abrirArchivoInput(); //Se coloca al inicio del archivo
             //Si no hay más datos que leer el ciclo infinito se suspende y se va al catch
            while(true){
                Usuario User1 = 
                           (Usuario)oLector.readObject();                
                listaUsuario.add(User1);
            }
         } //No se indica el catch ya que no se hará nada, solamente se lanzará por medio del throws  
        catch(Exception ex ){
            
       }
        finally{
           //Ocurra o no ocurra la excepción se cierra el archivo
           cerrarArchivoInput();   
           return listaUsuario;
        } 
       
    }

   //Busca y retorna el objeto Departamento de acuerdo al código que recibe como 
   //parámetro, en caso de que no lo encuentre retorna null
    public Usuario consultar(String correo)throws Exception {
        Usuario user,userFind= null ;
        try {
            abrirArchivoInput();
            //Si no hay más datos que leer el método available retorna cero
             while(true){
                user = (Usuario)oLector.readObject();  //Lee un objeto a la vez             
                if(user.getCorreo().equalsIgnoreCase(correo)) {
                    userFind = user;
                }
             }            
        }catch(Exception e){
            
        }
        finally{ //Suceda o no suceda la excepción se deben cerrar los archivos
             cerrarArchivoInput();    
             return userFind;
        }       
    }


    /**
     * Agregar un nuevo Departamento al final del archivo
     * @param usuario Objeto Departamento a agregar
     * @throws java.lang.Exception
     */
    public  void agregar(Usuario usuario)throws Exception {        
        try {
            this.abrirArchivoOutput(); //se coloca al final del archivo
            if (oEscritor != null) {
              //Ejecutar la escritura del objeto departamento en el archivo
               oEscritor.writeObject(usuario); //Serializa el objeto y lo graba en el archivo
               oEscritor.flush();  //Envía el contenido del buffer al archivo
               oEscritor.reset();//Se requiere para cuando se reciben subclases de Departamento, es obligatorio si hay herencia
            }
        
        } catch (Exception e) {
            throw e;
        }
        finally{
            //Ocurra o no la excepción se debe cerrar el archivo
            this.cerrarArchivoOutput(); //Cierra el archivo
        }        
    }

    /**
     * Agregar un nuevo Departamento al archivo
     * @param empleado Objeto Departamento a agregar
     */
      public void modificar(Usuario empleado) throws Exception{
        arrayUsuariosTemp = new ArrayList<>();
        try {            
            abrirArchivoInput();            
             //Pasar todos los objetos del archivo al ArrayList temporal modificando el 
            //objeto que se recibe como parámetro de acuerdo al código
             Usuario user1=null;
            //Si no hay más datos que leer el método available retorna cero
             while(true){//Si va a leer y no hay objeto Departamento se va por el catch
                 user1 = (Usuario)oLector.readObject(); //Si lee y no hay deparyamento que leer se cae
                 if(user1.getCorreo().equalsIgnoreCase(empleado.getCorreo())) {
                   user1=empleado;
                 }
                 arrayUsuariosTemp.add(user1);
             }  
        }
        catch(Exception ex){
            
        }
        finally{
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo();        
        }
        
    }
    
    
    
    public void eliminar(String correo) throws Exception {
        arrayUsuariosTemp = new ArrayList<>();
        try {            
            abrirArchivoInput();
            Usuario user1 = null;
            //Pasa al ArrayList temporal todos los departamentos cuyo código es 
            //diferente al del departamento que se recibe como parámetro
            while(true){
                 user1 = (Usuario)oLector.readObject();               
                 if(!user1.getCorreo().equalsIgnoreCase(correo)) {
                     arrayUsuariosTemp.add(user1);
                 }
             }                       
        }catch(Exception e){      
           
        }
        finally{
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo(); 
        }               
    }
    

    private void pasarArrayTemporal_Archivo() throws Exception {       
       File archivoOriginal = new File(RUTA_ARCHIVO);
       //Si hay departamentos en el ArrayList y el archivo existe
       //borra el archivo original para volverlo a llenar           
       
          if(archivoOriginal.exists()){
            archivoOriginal.delete();
          }  
          if(!arrayUsuariosTemp.isEmpty()){
             abrirArchivoOutput();  //Crea el nuevo archivo Departamento.txt
          //Pasa todos los departamentos del ArrayList al archivo
            for (Usuario user : arrayUsuariosTemp) {
             oEscritor.writeObject(user);   
             oEscritor.flush(); //Lo envía a disco
             oEscritor.reset(); //limpia el escritor para que se puedan grabar diferentes subclases
            }     
          }
          cerrarArchivoOutput();
    }  

}
