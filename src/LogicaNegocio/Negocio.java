/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import java.util.ArrayList;
import javax.print.DocFlavor;

/**
 *
 * @author Estudiante
 */
public class Negocio{
    private final Tipoempresa Tipo;
    ArrayList<Producto> ListaProductos = new ArrayList<>();
    private final Usuario Gerente;
    private String Nombre;
    private TipoRestaurante TipoRest;
    
    public Negocio(Tipoempresa Tipo, Usuario Gerente, String Nombre) {
        this.Tipo = Tipo;
        this.Gerente = Gerente;
        this.Nombre = Nombre;
    }

    public Negocio(Tipoempresa Tipo, Usuario Gerente, String Nombre, TipoRestaurante TipoRest) {
        this.Tipo = Tipo;
        this.Gerente = Gerente;
        this.Nombre = Nombre;
        this.TipoRest = TipoRest;
    }
    
    public void agregarProducto(Producto Producto){
        ListaProductos.add(Producto);
    }
    
    public void EliminarProducto(String NombreProducto){
        for (Producto Producto : ListaProductos) {
            if (Producto.getNombre().equals(NombreProducto)) {
                ListaProductos.remove(Producto);
            }
        }
    }

    public Tipoempresa getTipo() {
        return Tipo;
    }

    public Usuario getGerente() {
        return Gerente;
    }
    
    public String getNombre() {
        return Nombre;
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

    public ArrayList<Producto> getListaProductos() {
        return ListaProductos;
    }
    
    
    
    
    
    
    
}
