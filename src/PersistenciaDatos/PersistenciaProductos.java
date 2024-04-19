/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDatos;

import LogicaNegocio.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PersistenciaProductos {

    private static HashMap<String, Producto> listado = new HashMap<String, Producto>();

    public static void setProducto(Producto oProducto) {
        listado.put(String.valueOf(oProducto.getNombre()), oProducto);
    }

    public static Producto getProducto(String prodName) {
        return listado.get(prodName);
    }

    public static Producto getProductoPorNombre(String Producto) {
        for (Producto producto : listado.values()) {
            if (producto.getNombre().equals(Producto)) {
                return producto;
            }
        }
        return null; // Si no se encuentra ningún negocio asociado al gerente
    }

    public static List<Producto> getListado() {
        return new ArrayList<>(listado.values());
    }
}
