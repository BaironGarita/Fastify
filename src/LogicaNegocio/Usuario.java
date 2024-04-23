/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import PersistenciaDatos.UsuarioBD;
import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {

    private final String Correo;
    private String NumTar;
    private String contraseña;
    private String nombre;
    private TipoUsuario rol;
    private TipoTarjeta tarjeta;
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public Usuario(String login, String contraseña, String nombre, TipoUsuario rol) {
        this.Correo = login;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.rol = rol;
    }

    public Usuario(String login, String contraseña, String nombre, TipoUsuario rol, TipoTarjeta tarjeta, String NumTarjeta) {
        this.Correo = login;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.rol = rol;
        this.tarjeta = tarjeta;
        this.NumTar = NumTarjeta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConstraseña() {
        return contraseña;
    }

    public void agregrarCarrito(Producto oProducto) {
        listaProductos.add(oProducto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoUsuario getRol() {
        return rol;
    }

    public void setRol(TipoUsuario rol) {
        this.rol = rol;
    }

    public String getCorreo() {
        return Correo;
    }

    public TipoTarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TipoTarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNumTarjeta() {
        return NumTar;
    }

    public String getNumTar() {
        return NumTar;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public static Usuario consultar(String correo) throws Exception {
        return UsuarioBD.getInstance().consultar(correo);
    }

    public static void agregar(Usuario usuario) throws Exception {
        UsuarioBD.getInstance().agregar(usuario);
    }

    public static void eliminar(String correo) throws Exception {
        UsuarioBD.getInstance().eliminar(correo);
    }

    public static void modificar(Usuario usuario) throws Exception {
        UsuarioBD.getInstance().modificar(usuario);
    }

    public static ArrayList<Usuario> listado() throws Exception {
        return UsuarioBD.getInstance().lista();
    }

}
