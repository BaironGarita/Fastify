/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import LogicaNegocio.TipoUsuario;
import LogicaNegocio.Usuario;
import PersistenciaDatos.PersistenciaUsuarios;

/**
 *
 * @author Usuario
 */
public class PrincipalFastify {
    private static Usuario oUsuario = null;
   
    public static void main(String[] args) {
      crearUsuarios();
      login Login = new login();
      Login.setVisible(true);
//      Login.setLocationRelativeTo(null);
    }
    public static void crearUsuarios(){
        PersistenciaUsuarios.setUsuario(new Usuario("admin@gmail.com",
                "1234", "Administrador", TipoUsuario.ADMINISTRADOR));
         PersistenciaUsuarios.setUsuario(new Usuario("lagueroc@utn.ac.cr",
                "123456", "Laura Aguero", TipoUsuario.REGULAR));
    }

    public static Usuario getoUsuario() {
        return oUsuario;
    }
    public static void setoUsuario(Usuario oUsuario) {
        PrincipalFastify.oUsuario = oUsuario;
    }
}
