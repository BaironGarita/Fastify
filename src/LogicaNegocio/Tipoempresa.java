/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Estudiante
 */
public enum Tipoempresa {
    RESTAURANTE("Restaurante"),
    CAFETERIA("Cafeteria"),
    EMPRESA("Empresa");
    private String nombreTipo;

    private Tipoempresa(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    
    
}
