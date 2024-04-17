/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Usuario
 */
class Producto {
    private boolean perecedero;
    private String Nombre;
    private int Precio;
    private int cantidad;
    private double Impuestos;

    public Producto(boolean perecedero, String Nombre, int Precio, int cantidad, double Impuestos) {
        this.perecedero = perecedero;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.cantidad = cantidad;
        this.Impuestos = Impuestos;
    }
    
    
    
}
