/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDatos;

import LogicaNegocio.Empresa;
import LogicaNegocio.Negocio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PersistenciaEmpresa {
    private static HashMap<String,Negocio> listado = new HashMap<String, Negocio>();
    
    public static void setUsuario(Negocio oNegocio){
        listado.put(oNegocio.getLogin(), oNegocio);
    }
    public static Negocio getUsuario(String pLogin){
        return listado.get(pLogin);
    }
    public List<Negocio> getListado(){
        return new ArrayList<>(listado.values());
    }
}
