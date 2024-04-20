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
    private List<Producto> ListaProductos = new ArrayList<>();
    private final Usuario Gerente;
    private String Nombre;
    private TipoRestaurante TipoRest;

    public Negocio(TipoEmpresa Tipo, Usuario Gerente, String Nombre) {
        this.Tipo = Tipo;
        this.Gerente = Gerente;
        this.Nombre = Nombre;
    }

    public Negocio(TipoEmpresa Tipo, Usuario Gerente, String Nombre, TipoRestaurante TipoRest) {
        this.Tipo = Tipo;
        this.Gerente = Gerente;
        this.Nombre = Nombre;
        this.TipoRest = TipoRest;
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
        return ListaProductos;
    }

    public static Negocio consultarNegocio(String codigo) throws Exception {
        return NegocioBD.getInstance().consultarNegocios(codigo);
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
        ListaProductos.add(producto);
    }

    public void agregarProductos(List<Producto> productos) {
        ListaProductos = productos;
    }
}

