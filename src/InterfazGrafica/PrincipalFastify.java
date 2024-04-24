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

    public static void CrearUsuarios() throws Exception {
        Usuario.agregar(new Usuario("admin@gmail.com",
                "1234", "Administrador", TipoUsuario.ADMINISTRADOR));
        Usuario.agregar(new Usuario("gerenterest@gmail.com",
                "1234", "Luis", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("gerenterest1@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("gerenterest2@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("gerenterest3@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("gerenterest4@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("gerentecaf@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("gerentecaf1@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("gerentecaf2@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("gerentecaf3@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("gerentetind@gmail.com",
                "1234", "Bairon Garita", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("gerentetind1@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        Usuario.agregar(new Usuario("bairon@gmail.com",
                "1234", "Bairon Garita", TipoUsuario.REGULAR));
    }

    public static void CrearRestaurantes() throws Exception {
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.RESTAURANTE,
                Usuario.consultar("gerenterest@gmail.com"),
                "Las Catrinas", TipoRestaurante.MEXICANA));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.RESTAURANTE,
                Usuario.consultar("gerenterest1@gmail.com"),
                "Lleguele", TipoRestaurante.COMIDARAPIDA));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.RESTAURANTE,
                Usuario.consultar("gerenterest2@gmail.com"),
                "Mama-mia", TipoRestaurante.ITALIANO));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.RESTAURANTE,
                Usuario.consultar("gerenterest3@gmail.com"),
                "Don Jose", TipoRestaurante.ITALIANO));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.RESTAURANTE,
                Usuario.consultar("gerenterest4@gmail.com"),
                "Primer Sabor", TipoRestaurante.ASIATICA));
    }

    public static void CrearCafeterias() throws Exception {
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.CAFETERIA,
                Usuario.consultar("gerentecaf@gmail.com"), "starbucks"));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.CAFETERIA,
                Usuario.consultar("gerentecaf1@gmail.com"), "Cafe a la moda"));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.CAFETERIA,
                Usuario.consultar("gerentecaf2@gmail.com"), "Kawah Cafe"));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.CAFETERIA,
                Usuario.consultar("gerentecaf3@gmail.com"), "Mocapan"));
    }

    public static void CrearTiendas() throws Exception {
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.EMPRESA,
                Usuario.consultar("gerentetind@gmail.com"), "Walmart"));
        Negocio.agregarNegocio(new Negocio(TipoEmpresa.EMPRESA,
                Usuario.consultar("gerentetind1@gmail.com"), "Pequeño Mundo"));
    }

    public static void CrearProductos() throws Exception {
        Producto.agregarProducto(new Producto(true, "Coca-Cola", 1000, 0.13, Negocio.consultarNegocio("gerenterest@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Tacos de Birria", 3500, 0.13, Negocio.consultarNegocio("gerenterest@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Orden de Pollo", 2500, 0.13, Negocio.consultarNegocio("gerenterest1@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Hamburguesa lleguele", 4500, 0.13, Negocio.consultarNegocio("gerenterest1@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Pizza Suprema", 10000, 0.13, Negocio.consultarNegocio("gerenterest2@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Napolitana", 8300, 0.13, Negocio.consultarNegocio("gerenterest2@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Pollo en salsa Blanca", 5000, 0.13, Negocio.consultarNegocio("gerenterest3@gmail.com")));
        Producto.agregarProducto(new Producto(true, "La Don Jose", 8300, 0.13, Negocio.consultarNegocio("gerenterest3@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Entero de Cantones", 3500, 0.13, Negocio.consultarNegocio("gerenterest4@gmail.com")));
        Producto.agregarProducto(new Producto(true, "chopsuey", 4000, 0.13, Negocio.consultarNegocio("gerenterest4@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Mocca", 2500, 0.13, Negocio.consultarNegocio("gerentecaf@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Latte", 3000, 0.13, Negocio.consultarNegocio("gerentecaf@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Espresso", 2500, 0.13, Negocio.consultarNegocio("gerentecaf@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Cappuccino", 3000, 0.13, Negocio.consultarNegocio("gerentecaf@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Mocca", 2500, 0.13, Negocio.consultarNegocio("gerentecaf1@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Latte", 3000, 0.13, Negocio.consultarNegocio("gerentecaf1@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Espresso", 2500, 0.13, Negocio.consultarNegocio("gerentecaf1@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Cappuccino", 3000, 0.13, Negocio.consultarNegocio("gerentecaf1@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Mocca", 2500, 0.13, Negocio.consultarNegocio("gerentecaf2@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Latte", 3000, 0.13, Negocio.consultarNegocio("gerentecaf2@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Espresso", 2500, 0.13, Negocio.consultarNegocio("gerentecaf2@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Cappuccino", 3000, 0.13, Negocio.consultarNegocio("gerentecaf2@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Coca-Cola", 1000, 0.13, Negocio.consultarNegocio("gerentetind@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Helado", 500, 0.13, Negocio.consultarNegocio("gerentetind@gmail.com")));
        Producto.agregarProducto(new Producto(true, "Pizza de congelador", 12000, 0.13, Negocio.consultarNegocio("gerentetind@gmail.com")));
    }

    public static Usuario getoUsuario() {
        return oUsuario;
    }

    public static void setoUsuario(Usuario oUsuario) {
        PrincipalFastify.oUsuario = oUsuario;
    }
}
