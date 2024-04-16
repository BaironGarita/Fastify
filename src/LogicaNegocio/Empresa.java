/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Estudiante
 */
public class Empresa  extends Negocio{
    private final String login;

    public Empresa(String login, Tipoempresa Tipo, Usuario Gerente, String Nombre) {
        super(Tipo, Gerente, Nombre);
        this.login = login;
    }
    
    public String getLogin() {
        return login;
    }
    
    
}
