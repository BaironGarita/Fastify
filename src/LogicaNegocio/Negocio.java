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
    private final int Codigo;
    private List<Producto> arrayProductos;
    private final Usuario Gerente;
    private String Nombre;
    private TipoRestaurante TipoRest;

    public Negocio(TipoEmpresa Tipo, Usuario Gerente, String Nombre, int Codigo) {
        this.Tipo = Tipo;
        this.Gerente = Gerente;
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.arrayProductos = new ArrayList<Producto>();
    }

    public Negocio(TipoEmpresa Tipo, Usuario Gerente, String Nombre, TipoRestaurante TipoRest, int codigo) {
        this.Tipo = Tipo;
        this.Gerente = Gerente;
        this.Nombre = Nombre;
        this.TipoRest = TipoRest;
        this.Codigo = codigo;
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

    public int getCodigo() {
        return Codigo;
    }

    public List<Producto> getArrayProductos() {
        return arrayProductos;
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
        for (int i = 0; i < arrayProductos.size(); i++) {
            Producto producto = arrayProductos.get(i);
            if (producto.getNombre().equals(ProductoBuscar)) {
                return producto;
            }
        }
        return null;
    }
}
