/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import PersistenciaDatos.ProductoDb;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Producto{

    private boolean perecedero;
    private String Nombre;
    private int Precio;
    private int cantidad;
    private double Impuestos;

    public Producto(boolean perecedero, String Nombre, int Precio,double Impuestos) {
        this.perecedero = perecedero;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Impuestos = Impuestos;
    }

    public String getNombre() {
        return Nombre;
    }

////    public static Producto consultarProducto(String Nombre) throws Exception {
////        Producto Produc1 = ProductoDb.getInstance().consultarProductos(Nombre);
////        return Produc1;
////    }
////
////    public static void agregarProducto(Producto producto) throws Exception {
////        ProductoDb.getInstance().agregarDepartamento(producto);
////    }
////
////    public static void eliminarProducto(String Nombre) throws Exception {
////        ProductoDb.getInstance().eliminarProducto(Nombre);
////    }
////
////    public static void modificarProducto(Producto producto) throws Exception {
////        ProductoDb.getInstance().modificarProducto(producto);
////    }
////
////    public static ArrayList<Producto> listadoProductos() throws Exception {
////        ArrayList<Producto> arrayDepto = ProductoDb.getInstance().listaProductos();
////        return arrayDepto;
////    }
}
