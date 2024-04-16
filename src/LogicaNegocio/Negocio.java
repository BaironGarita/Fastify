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
    ArrayList<String> ListaProductos = new ArrayList<>();
    private final Usuario Gerente;
    private String Nombre;
    
    public Negocio(Tipoempresa Tipo, Usuario Gerente, String Nombre) {
        this.Tipo = Tipo;
        this.Gerente = Gerente;
        this.Nombre = Nombre;
    }
    
    public void agregarProducto(String Producto){
        ListaProductos.add(Producto);
    }

    public Tipoempresa getTipo() {
        return Tipo;
    }

    public Usuario getGerente() {
        return Gerente;
    }
    
    
    
    
    
}
