
package LogicaNegocio;

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
