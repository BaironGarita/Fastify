/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Restaurante extends Negocio{
    private TipoRestaurante TipoRest;
    ArrayList<Producto> ListaProductos = new ArrayList<>();

    public Restaurante(TipoRestaurante TipoRest,Tipoempresa Tipo, Usuario Gerente, String Nombre) {
        super(Tipo, Gerente, Nombre);
        this.TipoRest = TipoRest;
    }

    public void agregarproducto(Producto producto){
        ListaProductos.add(producto);
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

    public void setListaProductos(ArrayList<Producto> ListaProductos) {
        this.ListaProductos = ListaProductos;
    }
    
    
    
}
