/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import LogicaNegocio.Negocio;
import LogicaNegocio.TipoRestaurante;
import LogicaNegocio.TipoUsuario;
import LogicaNegocio.Tipoempresa;
import LogicaNegocio.Usuario;
import PersistenciaDatos.PersistenciaEmpresa;
import PersistenciaDatos.PersistenciaUsuarios;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PrincipalFastify {

    private static Usuario oUsuario = null;
    private static ArrayList<Negocio> ListaNegocios = new ArrayList<>();

    public static void main(String[] args) {
        CrearUsuarios();
        login Login = new login();
        Login.setVisible(true);
    }

    public static void CrearUsuarios() {
        PersistenciaUsuarios.setUsuario(new Usuario("admin@gmail.com",
                "1234", "Administrador", TipoUsuario.ADMINISTRADOR));
        PersistenciaUsuarios.setUsuario(new Usuario("gerenterest@gmail.com",
                "1234", "Luis", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerenterest1@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerenterest2@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerenterest3@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentecaf@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentecaf1@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentecaf2@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentecaf3@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentetind@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("gerentetind1@gmail.com",
                "1234", "Gerente", TipoUsuario.GERENTE));
        PersistenciaUsuarios.setUsuario(new Usuario("bairon@gmail.com",
                "1234", "Bairon Garita", TipoUsuario.REGULAR));
    }

    public static void CrearRestaurantes() {
        PersistenciaEmpresa.setnNegocio(new Negocio(Tipoempresa.RESTAURANTE, PersistenciaUsuarios.getUsuario("gerenterest@gmail.com"),
                "Las Catrinas", TipoRestaurante.MEXICANA));
        PersistenciaEmpresa.setnNegocio(new Negocio(Tipoempresa.RESTAURANTE, PersistenciaUsuarios.getUsuario("gerenterest1@gmail.com"),
                "Lleguele", TipoRestaurante.COMIDARAPIDA));
        PersistenciaEmpresa.setnNegocio(new Negocio(Tipoempresa.RESTAURANTE, PersistenciaUsuarios.getUsuario("gerenterest2@gmail.com"),
                "Mama-mia", TipoRestaurante.ITALIANO));
        PersistenciaEmpresa.setnNegocio(new Negocio(Tipoempresa.RESTAURANTE, PersistenciaUsuarios.getUsuario("gerenterest3@gmail.com"),
                "Primer Sabor", TipoRestaurante.ASIATICA));
    }

    public static void CrearCafeterias() {
        PersistenciaEmpresa.setnNegocio(new Negocio(Tipoempresa.CAFETERIA,
                PersistenciaUsuarios.getUsuario("gerentecaf@gmail.com"), "starbucks"));
        PersistenciaEmpresa.setnNegocio(new Negocio(Tipoempresa.CAFETERIA,
                PersistenciaUsuarios.getUsuario("gerentecaf1@gmail.com"), "Cafe a la moda"));
        PersistenciaEmpresa.setnNegocio(new Negocio(Tipoempresa.CAFETERIA,
                PersistenciaUsuarios.getUsuario("gerentecaf2@gmail.com"), "Kawah Cafe"));
        PersistenciaEmpresa.setnNegocio(new Negocio(Tipoempresa.CAFETERIA,
                PersistenciaUsuarios.getUsuario("gerentecaf3@gmail.com"), "Mocapan"));
    }

    public static void CrearTiendas() {
        PersistenciaEmpresa.setnNegocio(new Negocio(Tipoempresa.EMPRESA,
                PersistenciaUsuarios.getUsuario("gerentetind@gmail.com"), "Walmart"));
        PersistenciaEmpresa.setnNegocio(new Negocio(Tipoempresa.EMPRESA,
                PersistenciaUsuarios.getUsuario("gerentetind1@gmail.com"), "Pequeño Mundo"));
    }

    public static Usuario getoUsuario() {
        return oUsuario;
    }

    public static void setoUsuario(Usuario oUsuario) {
        PrincipalFastify.oUsuario = oUsuario;
    }
}
