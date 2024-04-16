/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Usuario
 */
public enum TipoRestaurante {
    COMIDARAPIDA("Comida Rapida"),
    ITALIANO("Italiano"),
    ASIATICA("Asiatico"),
    MEXICANA("Mexicana");
    
    private String tipoRest;

    private TipoRestaurante(String tipoRest) {
        this.tipoRest = tipoRest;
    }

    public String getTipoRest() {
        return tipoRest;
    }

    public void setTipoRest(String tipoRest) {
        this.tipoRest = tipoRest;
    }
    
    
    
    
}
