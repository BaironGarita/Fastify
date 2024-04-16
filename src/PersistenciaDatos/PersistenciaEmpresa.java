/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDatos;

import LogicaNegocio.Empresa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PersistenciaEmpresa {
    private static HashMap<String,Empresa> listado = new HashMap<String, Empresa>();
    
    public static void setUsuario(Empresa oEmpresa){
        listado.put(oEmpresa.getLogin(), oEmpresa);
    }
    public static Empresa getUsuario(String pLogin){
        return listado.get(pLogin);
    }
    public List<Empresa> getListado(){
        return new ArrayList<>(listado.values());
    }
}
