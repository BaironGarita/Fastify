/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private final String login;
    private String constraseña;
    private String nombre;
    private TipoUsuario rol;

    public Usuario(String login, String constraseña, String nombre, TipoUsuario rol) {
        this.login = login;
        this.constraseña = constraseña;
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getConstraseña() {
        return constraseña;
    }

    public void setConstraseña(String constraseña) {
        this.constraseña = constraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoUsuario getRol() {
        return rol;
    }

    public void setRol(TipoUsuario rol) {
        this.rol = rol;
    }

    public String getLogin() {
        return login;
    }
}
