/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDatos;

import LogicaNegocio.Negocio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import LogicaNegocio.Tipoempresa;

/**
 *
 * @author Usuario
 */
public class PersistenciaEmpresa {

    private static HashMap<String, Negocio> listado = new HashMap<String, Negocio>();


    public static void setnNegocio(Negocio oNegocio) {
        listado.put(String.valueOf(oNegocio.getGerente()), oNegocio);
    }

    public static Negocio getNegocio(String Gerente) {
        return listado.get(Gerente);
    }

    public static List<Negocio> getListado() {
        return new ArrayList<>(listado.values());
    }
}
