/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import PersistenciaDatos.ProductoDb;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Producto implements Serializable {

    private final boolean Empacado;
    private final String Nombre;
    private final int Precio;
    private final double Impuestos;

    public Producto(boolean empacado, String Nombre, int Precio, double Impuesto) {
        this.Empacado = empacado;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Impuestos = Impuesto;
    }

    public String getNombre() {
        return Nombre;
    }

    public boolean isEmpacado() {
        return Empacado;
    }

    public int getPrecio() {
        return Precio;
    }

    public double getImpuestos() {
        return Impuestos;
    }

    public static Producto consultarProducto(String Nombre) throws Exception {
        return ProductoDb.getInstance().consultarProductos(Nombre);
    }

    public static void agregarProducto(Producto producto) throws Exception {
        ProductoDb.getInstance().agregarProducto(producto);
    }

    public static void eliminarProducto(String Nombre) throws Exception {
        ProductoDb.getInstance().eliminarProducto(Nombre);
    }

    public static void modificarProducto(Producto producto) throws Exception {
        ProductoDb.getInstance().modificarProducto(producto);
    }

    public static List<Producto> listadoProductos() throws Exception {
        return ProductoDb.getInstance().listaProductos();
    }
}

