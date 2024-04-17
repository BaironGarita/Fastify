/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDatos;

import LogicaNegocio.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PersistenciaUsuarios {
    private static HashMap<String,Usuario> listado = new HashMap<String, Usuario>();
    
    public static void setUsuario(Usuario pUsuario){
        listado.put(pUsuario.getCorreo(), pUsuario);
    }
    public static Usuario getUsuario(String pLogin){
        return listado.get(pLogin);
    }
    public List<Usuario> getListado(){
        return new ArrayList<>(listado.values());
    }
}
