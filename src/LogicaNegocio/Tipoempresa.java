
package LogicaNegocio;


public enum TipoEmpresa {
    RESTAURANTE("Restaurante"),
    CAFETERIA("Cafeteria"),
    EMPRESA("Empresa");
    private String nombreTipo;

    private TipoEmpresa(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    
    
}
