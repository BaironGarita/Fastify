/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import PersistenciaDatos.NegocioBD;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Negocio implements Serializable {

    private final TipoEmpresa Tipo;
    private List<Producto> arrayProductos;
    private final Usuario Gerente;
    private String Nombre;
    private TipoRestaurante TipoRest;

    public Negocio(TipoEmpresa Tipo, Usuario Gerente, String Nombre) {
        this.Tipo = Tipo;
        this.Gerente = Gerente;
        this.Nombre = Nombre;
        this.arrayProductos = new ArrayList<Producto>();
    }

    public Negocio(TipoEmpresa Tipo, Usuario Gerente, String Nombre, TipoRestaurante TipoRest) {
        this.Tipo = Tipo;
        this.Gerente = Gerente;
        this.Nombre = Nombre;
        this.TipoRest = TipoRest;
        this.arrayProductos = new ArrayList<Producto>();
    }

    public String getNombre() {
        return Nombre;
    }

    public TipoEmpresa getTipo() {
        return Tipo;
    }

    public Usuario getGerente() {
        return Gerente;
    }

    public List<Producto> getArrayProductos() {
        return arrayProductos;
    }

    public void llenarTienda() throws Exception {
        arrayProductos.removeAll(arrayProductos);
        ArrayList<Producto> general = (ArrayList<Producto>) Producto.listadoProductos();
        for (Producto producto : general) {
            if (producto.getNegocio().equals(this)) {
                arrayProductos.add(producto);
            }

        }
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public TipoRestaurante getTipoRest() {
        return TipoRest;
    }

    public void setTipoRest(TipoRestaurante TipoRest) {
        this.TipoRest = TipoRest;
    }

    public List<Producto> getListaProductos() {
        return arrayProductos;
    }

    public static Negocio consultarNegocio(String codigo) throws Exception {
        return NegocioBD.getInstance().consultarNegocios(codigo);
    }

    public static Negocio consultarTienda(String codigo) throws Exception {
        return NegocioBD.getInstance().consultarTienda(codigo);
    }

    public static void agregarNegocio(Negocio oNegocio) throws Exception {
        NegocioBD.getInstance().agregarProducto(oNegocio);
    }

    public static void eliminarDepartamento(String codigo) throws Exception {
        NegocioBD.getInstance().eliminarNegocio(codigo);
    }

    public static void modificarNegocio(Negocio negocio) throws Exception {
        NegocioBD.getInstance().modificarNegocio(negocio);
    }

    public static List<Negocio> listadoNegocios() throws Exception {
        return NegocioBD.getInstance().listaNegocios();
    }

    public void agregarProducto(Producto producto) {
        arrayProductos.add(producto);
    }

    public void agregarProductos(List<Producto> productos) {
        arrayProductos = productos;
    }

    public void modificar(Producto productoEditar) {
        for (int i = 0; i < arrayProductos.size(); i++) {
            Producto producto = arrayProductos.get(i);
            if (producto.getNombre().equals(productoEditar.getNombre())) {
                arrayProductos.set(i, productoEditar);
                break;
            }
        }
    }

    public Producto Buscar(String ProductoBuscar) {
        // Verificar que arrayProductos no sea null
        if (arrayProductos == null) {
            return null;
        }

        // Comparación de nombres sin distinguir mayúsculas y minúsculas
        for (int i = 0; i < arrayProductos.size(); i++) {
            Producto producto = arrayProductos.get(i);
            if (producto.getNombre().equalsIgnoreCase(ProductoBuscar)) {
                return producto;
            }
        }
        return null;
    }

}
