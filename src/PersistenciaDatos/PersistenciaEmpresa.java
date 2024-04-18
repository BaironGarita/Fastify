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
import LogicaNegocio.Usuario;

/**
 *
 * @author Usuario
 */
public class PersistenciaEmpresa {

    private static HashMap<String, Negocio> listado = new HashMap<String, Negocio>();

    public static void setNegocio(Negocio oNegocio) {
        listado.put(String.valueOf(oNegocio.getGerente()), oNegocio);
    }

    public static Negocio getNegocio(String Gerente) {
        return listado.get(Gerente);
    }

    public static Negocio getNegocioPorGerente(String Gerente) {
        for (Negocio negocio : listado.values()) {
            if (negocio.getGerente().getCorreo().equals(Gerente)) {
                return negocio;
            }
        }
        return null; // Si no se encuentra ningún negocio asociado al gerente
    }

    public static List<Negocio> getListado() {
        return new ArrayList<>(listado.values());
    }
}
