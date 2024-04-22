/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import LogicaNegocio.Negocio;
import LogicaNegocio.Producto;
import LogicaNegocio.TipoRestaurante;
import LogicaNegocio.TipoUsuario;
import LogicaNegocio.TipoEmpresa;
import LogicaNegocio.Usuario;
import PersistenciaDatos.PersistenciaUsuarios;
import java.util.ArrayList;

public class PrincipalFastify {
    
    private static Usuario oUsuario = null;
    private static ArrayList<Negocio> ListaNegocios = new ArrayList<>();

public static void main(String[] args) throws Exception {
        CrearUsuarios();
        CrearRestaurantes();
        CrearCafeterias();
        login Login = new login();
        Login.setVisible(true);
    }


    public static void CrearUsuarios() {
        PersistenciaUsuarios.setUsuario(new Usuario("admin@gmail.com",
                "1234", "Administrador", TipoUsuario.ADMINISTRADOR));
        PersistenciaUsuarios.setUsuario(new Usuario("gerenterest@gmail.com",
                "1234", "Luis", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerenterest1@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerenterest2@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerenterest3@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerenterest4@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentecaf@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentecaf1@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentecaf2@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentecaf3@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentetind@gmail.com",
                "1234", "Bairon Garita", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentetind1@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("bairon@gmail.com",
                "1234", "Bairon Garita", TipoUsuario.REGULAR));
    }

    public static void CrearRestaurantes() throws Exception {
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.RESTAURANTE, 
                PersistenciaUsuarios.getUsuario("gerenterest@gmail.com"),
                "Las Catrinas", TipoRestaurante.MEXICANA,0));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.RESTAURANTE, 
                PersistenciaUsuarios.getUsuario("gerenterest1@gmail.com"),
                "Lleguele", TipoRestaurante.COMIDARAPIDA,1));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.RESTAURANTE, 
                PersistenciaUsuarios.getUsuario("gerenterest2@gmail.com"),
                "Mama-mia", TipoRestaurante.ITALIANO,2));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.RESTAURANTE, 
                PersistenciaUsuarios.getUsuario("gerenterest3@gmail.com"),
                "Don Jose", TipoRestaurante.ITALIANO,3));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.RESTAURANTE, 
                PersistenciaUsuarios.getUsuario("gerenterest4@gmail.com"),
                "Primer Sabor", TipoRestaurante.ASIATICA,4));
    }

    public static void CrearCafeterias() throws Exception {
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.CAFETERIA,
                PersistenciaUsuarios.getUsuario("gerentecaf@gmail.com"), "starbucks",5));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.CAFETERIA,
                PersistenciaUsuarios.getUsuario("gerentecaf1@gmail.com"), "Cafe a la moda",6));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.CAFETERIA,
                PersistenciaUsuarios.getUsuario("gerentecaf2@gmail.com"), "Kawah Cafe",7));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.CAFETERIA,
                PersistenciaUsuarios.getUsuario("gerentecaf3@gmail.com"), "Mocapan",8));
    }

    public static void CrearTiendas() throws Exception {
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.EMPRESA,
                PersistenciaUsuarios.getUsuario("gerentetind@gmail.com"), "Walmart",9));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.EMPRESA,
                PersistenciaUsuarios.getUsuario("gerentetind1@gmail.com"), "Pequeño Mundo",10));
    }
    
    public static void CrearProductos() throws Exception {
        Producto.agregarProducto(new Producto(true, "Coca-Cola", 1000, 0.13,Negocio.consultarNegocio("gerenterest@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Tacos de Birria", 3500, 0.13,Negocio.consultarNegocio("gerenterest@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Orden de Pollo",2500, 0.13,Negocio.consultarNegocio("gerenterest1@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Hamburguesa lleguele", 4500, 0.13,Negocio.consultarNegocio("gerenterest1@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Pizza Suprema", 10000, 0.13,Negocio.consultarNegocio("gerenterest2@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Napolitana", 8300, 0.13,Negocio.consultarNegocio("gerenterest2@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Pollo en salsa Blanca", 5000, 0.13,Negocio.consultarNegocio("gerenterest3@gmail.com")));
        Producto.agregarProducto(new Producto(true, "La Don Jose", 8300, 0.13,Negocio.consultarNegocio("gerenterest3@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Entero de Cantones", 3500, 0.13,Negocio.consultarNegocio("gerenterest4@gmail.com")));
        Producto.agregarProducto(new Producto(true, "chopsuey", 4000, 0.13,Negocio.consultarNegocio("gerenterest4@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Mocca", 2500, 0.13,Negocio.consultarNegocio("gerentecaf@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Latte", 3000, 0.13,Negocio.consultarNegocio("gerentecaf@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Espresso", 2500, 0.13,Negocio.consultarNegocio("gerentecaf@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Cappuccino", 3000, 0.13,Negocio.consultarNegocio("gerentecaf@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Coca-Cola", 1000, 0.13,Negocio.consultarNegocio("gerentetind@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Helado", 500, 0.13,Negocio.consultarNegocio("gerentetind@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Pizza de congelador", 12000, 0.13,Negocio.consultarNegocio("gerentetind@gmail.com")));    
    }
    
    public static Usuario getoUsuario() {
        return oUsuario;
    }

    public static void setoUsuario(Usuario oUsuario) {
        PrincipalFastify.oUsuario = oUsuario;
    }
}
