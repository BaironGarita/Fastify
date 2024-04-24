/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica;

import static InterfazGrafica.register.Login;
import LogicaNegocio.Negocio;
import LogicaNegocio.Producto;
import LogicaNegocio.TipoRestaurante;
import LogicaNegocio.TipoEmpresa;
import LogicaNegocio.Usuario;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class MainMenu extends javax.swing.JFrame {

    private Producto ProductMantenimiento = null;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DefaultTableModel modeloTablaProductos = new DefaultTableModel();
    DefaultTableModel modeloTablaCarrito = new DefaultTableModel();
    DefaultTableModel modeloTablaRest = new DefaultTableModel();
    DefaultTableModel modeloTablaClientes = new DefaultTableModel();
    private Usuario useradmin = login.Usuariolog;
    private Usuario user = login.oUsuario;
    private Negocio SucursalGerente = login.Gerente;
    private TipoEmpresa Empresa;
    private TipoRestaurante Restaurate;
    private Producto productoMant;
    private String nombreProducto;
    private String PrecioProducto;
    private String ImpuestoProducto;

    public MainMenu() throws Exception {
        initComponents();
        modeloTabla = (DefaultTableModel) TblGerneteProductos.getModel();
        modeloTablaProductos = (DefaultTableModel) TblRestauranteProductos.getModel();
        modeloTablaCarrito = (DefaultTableModel) TblCarritoCompras.getModel();
        modeloTablaRest = (DefaultTableModel) TblRestaurantes.getModel();
        modeloTablaClientes = (DefaultTableModel) TblClientes.getModel();
        ColoresBotones();
        llenarNegocios();
        llenarRestaurantes();
        LblUsuario.setText(login.nombre);
        switch (login.rol) {
            case REGULAR -> {
                BtnCarritoCompras.setVisible(false);
                BtnGerente.setVisible(false);
                BtnMantenimiento.setVisible(false);
            }
            case GERENTE -> {
                BtnCarritoCompras.setVisible(false);
                BtnMantenimiento.setVisible(false);
            }
            default -> {
                BtnGerente.setVisible(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtgTipoEmpacado = new javax.swing.ButtonGroup();
        PnlUsuario = new javax.swing.JPanel();
        LblIconUsuario = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        BtnRestaurante = new javax.swing.JButton();
        BtnCarritoCompras = new javax.swing.JButton();
        BtnGerente = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnMantenimiento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LblExit = new javax.swing.JLabel();
        TpnVentanas = new javax.swing.JTabbedPane();
        PnlDefault = new javax.swing.JPanel();
        LblImgDefault = new javax.swing.JLabel();
        PnlRestaurante = new javax.swing.JPanel();
        LblImagenRestaurante = new javax.swing.JLabel();
        CboTipoDeEmpresa = new javax.swing.JComboBox<>();
        LblTipoEmpresa = new javax.swing.JLabel();
        LblProductos = new javax.swing.JLabel();
        LblCantidad = new javax.swing.JLabel();
        TxtCantidadProductos = new javax.swing.JTextField();
        BtnMas = new javax.swing.JButton();
        BtnMenos = new javax.swing.JButton();
        BtnComprarProducto = new javax.swing.JButton();
        LblSeleccion = new javax.swing.JLabel();
        CboRestaurante = new javax.swing.JComboBox<>();
        LblTipoRestaurante = new javax.swing.JLabel();
        CboTipoRestaurante = new javax.swing.JComboBox<>();
        LblTipoEmpacado = new javax.swing.JLabel();
        RdoEmpacadoCompra = new javax.swing.JRadioButton();
        RdoPreparadoCompra = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblRestauranteProductos = new javax.swing.JTable();
        PnlCarritoCompras = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblCarritoCompras = new javax.swing.JTable();
        LblCarritoCompras = new javax.swing.JLabel();
        infoMontoCompra = new javax.swing.JLabel();
        BtnPagarCompras = new javax.swing.JButton();
        PnlGerente = new javax.swing.JPanel();
        LblImgGerente = new javax.swing.JLabel();
        LblGerente = new javax.swing.JLabel();
        LblRestauranteCargo = new javax.swing.JLabel();
        InfoGenteNegocio = new javax.swing.JLabel();
        LblNumeroDeProductos = new javax.swing.JLabel();
        InfoCantidadDeProductos = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminarProductos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblGerneteProductos = new javax.swing.JTable();
        PnlMantenimiento = new javax.swing.JPanel();
        LblImgAdmin = new javax.swing.JLabel();
        LblAdministrador = new javax.swing.JLabel();
        LblAdministradorInfo = new javax.swing.JLabel();
        LblInfoAdmin = new javax.swing.JLabel();
        LblInfoRestaurantes = new javax.swing.JLabel();
        LblInfoRest = new javax.swing.JLabel();
        BtnAgregarRest = new javax.swing.JButton();
        BtnEliminarRest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblRestaurantes = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TblClientes = new javax.swing.JTable();
        BtnAgregarCliente = new javax.swing.JButton();
        BtnEliminarCliente = new javax.swing.JButton();
        PnlInfoUsuario = new javax.swing.JPanel();
        LblInfoNameUser = new javax.swing.JLabel();
        LtlCorreo = new javax.swing.JLabel();
        lblInfoCorreo = new javax.swing.JLabel();
        LTlContra = new javax.swing.JLabel();
        LblInfoContra = new javax.swing.JLabel();
        LtlTarjeta = new javax.swing.JLabel();
        LblInfoNumTar = new javax.swing.JLabel();
        LblDecoUsuario = new javax.swing.JLabel();
        LtlRol = new javax.swing.JLabel();
        LblInfoRol = new javax.swing.JLabel();
        PnlAgregarEditar = new javax.swing.JPanel();
        LblNombreProducto = new javax.swing.JLabel();
        TxtNombreProducto = new javax.swing.JTextField();
        LblPrecio = new javax.swing.JLabel();
        LblPerecedero = new javax.swing.JLabel();
        LblImpuesto = new javax.swing.JLabel();
        TxtPrecioProducto = new javax.swing.JTextField();
        TxtImpuestoProducto = new javax.swing.JTextField();
        RdoEmpacado = new javax.swing.JRadioButton();
        RdoPreparado = new javax.swing.JRadioButton();
        BtnAgregarProducto = new javax.swing.JButton();
        BtnEditarProducto = new javax.swing.JButton();
        PnlMantenimientoAdministrador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 530));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlUsuario.setBackground(new java.awt.Color(0, 57, 114));
        PnlUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LblIconUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblIconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/172626_user_male_icon.png"))); // NOI18N
        LblIconUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblIconUsuario.setPreferredSize(new java.awt.Dimension(70, 70));
        LblIconUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblIconUsuarioMouseClicked(evt);
            }
        });

        LblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblUsuario.setText("Bairon");
        LblUsuario.setPreferredSize(new java.awt.Dimension(70, 16));

        BtnRestaurante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnRestaurante.setForeground(new java.awt.Color(0, 57, 114));
        BtnRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/185114_chef_restaurant_food_icon.png"))); // NOI18N
        BtnRestaurante.setText("Restaurantes");
        BtnRestaurante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestauranteActionPerformed(evt);
            }
        });

        BtnCarritoCompras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCarritoCompras.setForeground(new java.awt.Color(0, 57, 114));
        BtnCarritoCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/185101_shopping_caddie_icon.png"))); // NOI18N
        BtnCarritoCompras.setText("Carrito");
        BtnCarritoCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCarritoCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCarritoComprasActionPerformed(evt);
            }
        });

        BtnGerente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnGerente.setForeground(new java.awt.Color(0, 57, 114));
        BtnGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2318438_boss_officeworker_worker w_ tie_businessman_manager_icon.png"))); // NOI18N
        BtnGerente.setText("Gerente");
        BtnGerente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGerenteActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(0, 57, 114));
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/3005766_account_door_exit_logout_icon.png"))); // NOI18N
        BtnSalir.setText("Cerrar Sesion");
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnMantenimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnMantenimiento.setForeground(new java.awt.Color(0, 57, 114));
        BtnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10384008_digital_maintenance_cmms_system_management_icon.png"))); // NOI18N
        BtnMantenimiento.setText("Mantenimiento");
        BtnMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMantenimientoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        LblExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblExit.setForeground(new java.awt.Color(255, 255, 255));
        LblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblExit.setText("X");
        LblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PnlUsuarioLayout = new javax.swing.GroupLayout(PnlUsuario);
        PnlUsuario.setLayout(PnlUsuarioLayout);
        PnlUsuarioLayout.setHorizontalGroup(
            PnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PnlUsuarioLayout.createSequentialGroup()
                        .addGroup(PnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LblIconUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(LblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCarritoCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnRestaurante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        PnlUsuarioLayout.setVerticalGroup(
            PnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlUsuarioLayout.createSequentialGroup()
                .addGroup(PnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblIconUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addComponent(LblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnRestaurante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCarritoCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnMantenimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addContainerGap())
        );

        getContentPane().add(PnlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 208, 530));

        TpnVentanas.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        TpnVentanas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TpnVentanas.setDoubleBuffered(true);

        PnlDefault.setBackground(new java.awt.Color(255, 255, 255));

        LblImgDefault.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblImgDefault.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Restaurant.png"))); // NOI18N

        javax.swing.GroupLayout PnlDefaultLayout = new javax.swing.GroupLayout(PnlDefault);
        PnlDefault.setLayout(PnlDefaultLayout);
        PnlDefaultLayout.setHorizontalGroup(
            PnlDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblImgDefault, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        PnlDefaultLayout.setVerticalGroup(
            PnlDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblImgDefault, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        TpnVentanas.addTab("1", PnlDefault);

        PnlRestaurante.setBackground(new java.awt.Color(255, 255, 255));

        LblImagenRestaurante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblImagenRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/185114_chef_restaurant_food_icon.png"))); // NOI18N

        CboTipoDeEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        CboTipoDeEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CboTipoDeEmpresa.setForeground(new java.awt.Color(0, 57, 114));
        CboTipoDeEmpresa.setBorder(null);
        CboTipoDeEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CboTipoDeEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboTipoDeEmpresaActionPerformed(evt);
            }
        });

        LblTipoEmpresa.setFont(LblTipoEmpresa.getFont().deriveFont(LblTipoEmpresa.getFont().getSize()+2f));
        LblTipoEmpresa.setForeground(new java.awt.Color(0, 57, 114));
        LblTipoEmpresa.setText("Tipo de Empresa");

        LblProductos.setFont(LblProductos.getFont().deriveFont(LblProductos.getFont().getSize()+2f));
        LblProductos.setForeground(new java.awt.Color(0, 57, 114));
        LblProductos.setText("Productos");

        LblCantidad.setFont(LblCantidad.getFont().deriveFont(LblCantidad.getFont().getSize()+2f));
        LblCantidad.setForeground(new java.awt.Color(0, 57, 114));
        LblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCantidad.setText("Cantidad");

        TxtCantidadProductos.setBackground(new java.awt.Color(255, 255, 255));
        TxtCantidadProductos.setFont(TxtCantidadProductos.getFont().deriveFont(TxtCantidadProductos.getFont().getSize()+6f));
        TxtCantidadProductos.setForeground(new java.awt.Color(0, 57, 114));
        TxtCantidadProductos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCantidadProductos.setText("1");
        TxtCantidadProductos.setBorder(null);
        TxtCantidadProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnMas.setFont(BtnMas.getFont().deriveFont(BtnMas.getFont().getSize()+2f));
        BtnMas.setForeground(new java.awt.Color(255, 255, 255));
        BtnMas.setText("+");
        BtnMas.setBorder(null);
        BtnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMasActionPerformed(evt);
            }
        });

        BtnMenos.setFont(BtnMenos.getFont().deriveFont(BtnMenos.getFont().getSize()+2f));
        BtnMenos.setForeground(new java.awt.Color(255, 255, 255));
        BtnMenos.setText("-");
        BtnMenos.setBorder(null);
        BtnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenosActionPerformed(evt);
            }
        });

        BtnComprarProducto.setForeground(new java.awt.Color(255, 255, 255));
        BtnComprarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pagar.png"))); // NOI18N
        BtnComprarProducto.setText("Comprar");
        BtnComprarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarProductoActionPerformed(evt);
            }
        });

        LblSeleccion.setFont(LblSeleccion.getFont().deriveFont(LblSeleccion.getFont().getSize()+2f));
        LblSeleccion.setForeground(new java.awt.Color(0, 57, 114));
        LblSeleccion.setText("Info");

        CboRestaurante.setBackground(new java.awt.Color(255, 255, 255));
        CboRestaurante.setFont(CboRestaurante.getFont().deriveFont(CboRestaurante.getFont().getSize()+2f));
        CboRestaurante.setForeground(new java.awt.Color(0, 57, 114));
        CboRestaurante.setBorder(null);
        CboRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboRestauranteActionPerformed(evt);
            }
        });

        LblTipoRestaurante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblTipoRestaurante.setForeground(new java.awt.Color(0, 57, 114));
        LblTipoRestaurante.setText("Tipo Restaurante");

        CboTipoRestaurante.setBackground(new java.awt.Color(255, 255, 255));
        CboTipoRestaurante.setFont(CboTipoRestaurante.getFont().deriveFont(CboTipoRestaurante.getFont().getSize()+2f));
        CboTipoRestaurante.setForeground(new java.awt.Color(0, 57, 114));
        CboTipoRestaurante.setBorder(null);
        CboTipoRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboTipoRestauranteActionPerformed(evt);
            }
        });

        LblTipoEmpacado.setFont(LblTipoEmpacado.getFont().deriveFont(LblTipoEmpacado.getFont().getSize()+2f));
        LblTipoEmpacado.setForeground(new java.awt.Color(0, 57, 114));
        LblTipoEmpacado.setText("Tipo de Empacado");

        BtgTipoEmpacado.add(RdoEmpacadoCompra);
        RdoEmpacadoCompra.setFont(RdoEmpacadoCompra.getFont().deriveFont(RdoEmpacadoCompra.getFont().getSize()+2f));
        RdoEmpacadoCompra.setForeground(new java.awt.Color(0, 57, 114));
        RdoEmpacadoCompra.setText("Empacado");

        BtgTipoEmpacado.add(RdoPreparadoCompra);
        RdoPreparadoCompra.setFont(RdoPreparadoCompra.getFont().deriveFont(RdoPreparadoCompra.getFont().getSize()+2f));
        RdoPreparadoCompra.setForeground(new java.awt.Color(0, 57, 114));
        RdoPreparadoCompra.setText("Preparado");

        TblRestauranteProductos.setFont(TblRestauranteProductos.getFont().deriveFont(TblRestauranteProductos.getFont().getSize()+2f));
        TblRestauranteProductos.setForeground(new java.awt.Color(0, 0, 0));
        TblRestauranteProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        TblRestauranteProductos.setSelectionBackground(new java.awt.Color(0, 57, 114));
        jScrollPane4.setViewportView(TblRestauranteProductos);

        javax.swing.GroupLayout PnlRestauranteLayout = new javax.swing.GroupLayout(PnlRestaurante);
        PnlRestaurante.setLayout(PnlRestauranteLayout);
        PnlRestauranteLayout.setHorizontalGroup(
            PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRestauranteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRestauranteLayout.createSequentialGroup()
                        .addGroup(PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CboTipoDeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblSeleccion)
                            .addComponent(CboRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlRestauranteLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(CboTipoRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlRestauranteLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(LblProductos))))
                    .addGroup(PnlRestauranteLayout.createSequentialGroup()
                        .addComponent(BtnComprarProducto)
                        .addGap(18, 18, 18)
                        .addComponent(LblTipoEmpacado))
                    .addGroup(PnlRestauranteLayout.createSequentialGroup()
                        .addComponent(LblTipoEmpresa)
                        .addGap(183, 183, 183)
                        .addGroup(PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlRestauranteLayout.createSequentialGroup()
                                .addComponent(RdoEmpacadoCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RdoPreparadoCompra))
                            .addComponent(LblTipoRestaurante)))
                    .addGroup(PnlRestauranteLayout.createSequentialGroup()
                        .addComponent(BtnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtCantidadProductos))
                        .addGap(18, 18, 18)
                        .addComponent(BtnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlRestauranteLayout.createSequentialGroup()
                .addComponent(LblImagenRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PnlRestauranteLayout.setVerticalGroup(
            PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRestauranteLayout.createSequentialGroup()
                .addComponent(LblImagenRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTipoEmpresa)
                    .addComponent(LblTipoRestaurante)
                    .addComponent(LblTipoEmpacado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CboTipoDeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CboTipoRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RdoEmpacadoCompra)
                    .addComponent(RdoPreparadoCompra))
                .addGap(18, 18, 18)
                .addGroup(PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblSeleccion)
                    .addComponent(LblProductos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRestauranteLayout.createSequentialGroup()
                        .addComponent(CboRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(LblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnlRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnComprarProducto))
                    .addGroup(PnlRestauranteLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        TpnVentanas.addTab("2", PnlRestaurante);

        PnlCarritoCompras.setBackground(new java.awt.Color(255, 255, 255));

        TblCarritoCompras.setFont(TblCarritoCompras.getFont().deriveFont(TblCarritoCompras.getFont().getSize()+2f));
        TblCarritoCompras.setForeground(new java.awt.Color(0, 0, 0));
        TblCarritoCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ));
        TblCarritoCompras.setSelectionBackground(new java.awt.Color(0, 57, 114));
        TblCarritoCompras.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(TblCarritoCompras);

        LblCarritoCompras.setFont(LblCarritoCompras.getFont().deriveFont(LblCarritoCompras.getFont().getSize()+2f));
        LblCarritoCompras.setForeground(new java.awt.Color(0, 57, 114));
        LblCarritoCompras.setText("Monto Compra :");

        infoMontoCompra.setFont(infoMontoCompra.getFont().deriveFont(infoMontoCompra.getFont().getSize()+2f));
        infoMontoCompra.setForeground(new java.awt.Color(0, 57, 114));
        infoMontoCompra.setText("Info");

        BtnPagarCompras.setFont(BtnPagarCompras.getFont().deriveFont(BtnPagarCompras.getFont().getSize()+2f));
        BtnPagarCompras.setForeground(new java.awt.Color(255, 255, 255));
        BtnPagarCompras.setText("Pagar");
        BtnPagarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPagarComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlCarritoComprasLayout = new javax.swing.GroupLayout(PnlCarritoCompras);
        PnlCarritoCompras.setLayout(PnlCarritoComprasLayout);
        PnlCarritoComprasLayout.setHorizontalGroup(
            PnlCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCarritoComprasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PnlCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCarritoComprasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 527, Short.MAX_VALUE)
                        .addComponent(BtnPagarCompras))
                    .addGroup(PnlCarritoComprasLayout.createSequentialGroup()
                        .addGroup(PnlCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlCarritoComprasLayout.createSequentialGroup()
                                .addComponent(LblCarritoCompras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoMontoCompra))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlCarritoComprasLayout.setVerticalGroup(
            PnlCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCarritoComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PnlCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCarritoCompras)
                    .addComponent(infoMontoCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(BtnPagarCompras)
                .addContainerGap())
        );

        TpnVentanas.addTab("3", PnlCarritoCompras);

        PnlGerente.setBackground(new java.awt.Color(255, 255, 255));

        LblImgGerente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblImgGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2318438_boss_officeworker_worker w_ tie_businessman_manager_icon.png"))); // NOI18N

        LblGerente.setFont(LblGerente.getFont().deriveFont(LblGerente.getFont().getSize()+2f));
        LblGerente.setForeground(new java.awt.Color(0, 57, 114));
        LblGerente.setText("Gerente");

        LblRestauranteCargo.setFont(LblRestauranteCargo.getFont().deriveFont(LblRestauranteCargo.getFont().getSize()+2f));
        LblRestauranteCargo.setForeground(new java.awt.Color(0, 57, 114));
        LblRestauranteCargo.setText("Restaurante a Cargo :");

        InfoGenteNegocio.setFont(InfoGenteNegocio.getFont().deriveFont(InfoGenteNegocio.getFont().getSize()+2f));
        InfoGenteNegocio.setForeground(new java.awt.Color(0, 57, 114));
        InfoGenteNegocio.setText("Info ");

        LblNumeroDeProductos.setFont(LblNumeroDeProductos.getFont().deriveFont(LblNumeroDeProductos.getFont().getSize()+2f));
        LblNumeroDeProductos.setForeground(new java.awt.Color(0, 57, 114));
        LblNumeroDeProductos.setText("Numero de Productos :");

        InfoCantidadDeProductos.setFont(InfoCantidadDeProductos.getFont().deriveFont(InfoCantidadDeProductos.getFont().getSize()+2f));
        InfoCantidadDeProductos.setForeground(new java.awt.Color(0, 57, 114));
        InfoCantidadDeProductos.setText("Info");

        BtnAgregar.setFont(BtnAgregar.getFont().deriveFont(BtnAgregar.getFont().getSize()+2f));
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Agregar.png"))); // NOI18N
        BtnAgregar.setText("Agregra");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnEliminarProductos.setFont(BtnEliminarProductos.getFont().deriveFont(BtnEliminarProductos.getFont().getSize()+2f));
        BtnEliminarProductos.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remover.png"))); // NOI18N
        BtnEliminarProductos.setText("Eliminar");
        BtnEliminarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarProductosActionPerformed(evt);
            }
        });

        TblGerneteProductos.setFont(TblGerneteProductos.getFont().deriveFont(TblGerneteProductos.getFont().getSize()+2f));
        TblGerneteProductos.setForeground(new java.awt.Color(0, 0, 0));
        TblGerneteProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Impuesto", "Perecedero"
            }
        ));
        TblGerneteProductos.setSelectionBackground(new java.awt.Color(0, 57, 114));
        jScrollPane2.setViewportView(TblGerneteProductos);
        if (TblGerneteProductos.getColumnModel().getColumnCount() > 0) {
            TblGerneteProductos.getColumnModel().getColumn(2).setHeaderValue("Impuesto");
            TblGerneteProductos.getColumnModel().getColumn(3).setHeaderValue("Perecedero");
        }

        javax.swing.GroupLayout PnlGerenteLayout = new javax.swing.GroupLayout(PnlGerente);
        PnlGerente.setLayout(PnlGerenteLayout);
        PnlGerenteLayout.setHorizontalGroup(
            PnlGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlGerenteLayout.createSequentialGroup()
                .addGroup(PnlGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlGerenteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(LblGerente)
                            .addComponent(LblImgGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PnlGerenteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PnlGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                            .addGroup(PnlGerenteLayout.createSequentialGroup()
                                .addGroup(PnlGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnlGerenteLayout.createSequentialGroup()
                                        .addComponent(BtnAgregar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnEliminarProductos))
                                    .addGroup(PnlGerenteLayout.createSequentialGroup()
                                        .addComponent(LblNumeroDeProductos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(InfoCantidadDeProductos))
                                    .addGroup(PnlGerenteLayout.createSequentialGroup()
                                        .addComponent(LblRestauranteCargo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(InfoGenteNegocio)))
                                .addGap(0, 380, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        PnlGerenteLayout.setVerticalGroup(
            PnlGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlGerenteLayout.createSequentialGroup()
                .addComponent(LblImgGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblGerente)
                .addGap(18, 18, 18)
                .addGroup(PnlGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRestauranteCargo)
                    .addComponent(InfoGenteNegocio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNumeroDeProductos)
                    .addComponent(InfoCantidadDeProductos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnEliminarProductos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        TpnVentanas.addTab("4", PnlGerente);

        PnlMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        PnlMantenimiento.setDoubleBuffered(false);

        LblImgAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblImgAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10384008_digital_maintenance_cmms_system_management_icon.png"))); // NOI18N

        LblAdministrador.setFont(LblAdministrador.getFont().deriveFont(LblAdministrador.getFont().getSize()+2f));
        LblAdministrador.setForeground(new java.awt.Color(0, 57, 114));
        LblAdministrador.setText("Administrador");

        LblAdministradorInfo.setFont(LblAdministradorInfo.getFont().deriveFont(LblAdministradorInfo.getFont().getSize()+2f));
        LblAdministradorInfo.setForeground(new java.awt.Color(0, 57, 114));
        LblAdministradorInfo.setText("Nombre del administrador :");

        LblInfoAdmin.setFont(LblInfoAdmin.getFont().deriveFont(LblInfoAdmin.getFont().getSize()+2f));
        LblInfoAdmin.setForeground(new java.awt.Color(0, 57, 114));
        LblInfoAdmin.setText("Info");

        LblInfoRestaurantes.setFont(LblInfoRestaurantes.getFont().deriveFont(LblInfoRestaurantes.getFont().getSize()+2f));
        LblInfoRestaurantes.setForeground(new java.awt.Color(0, 57, 114));
        LblInfoRestaurantes.setText("Nombre del administrador :");

        LblInfoRest.setFont(LblInfoRest.getFont().deriveFont(LblInfoRest.getFont().getSize()+2f));
        LblInfoRest.setForeground(new java.awt.Color(0, 57, 114));
        LblInfoRest.setText("Info");

        BtnAgregarRest.setFont(BtnAgregarRest.getFont().deriveFont(BtnAgregarRest.getFont().getSize()+2f));
        BtnAgregarRest.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregarRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Agregar.png"))); // NOI18N
        BtnAgregarRest.setText("Agregar");

        BtnEliminarRest.setFont(BtnEliminarRest.getFont().deriveFont(BtnEliminarRest.getFont().getSize()+2f));
        BtnEliminarRest.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remover.png"))); // NOI18N
        BtnEliminarRest.setText("Eliminar");
        BtnEliminarRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarRestActionPerformed(evt);
            }
        });

        TblRestaurantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Gerente"
            }
        ));
        jScrollPane1.setViewportView(TblRestaurantes);

        TblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Tipo"
            }
        ));
        jScrollPane5.setViewportView(TblClientes);

        BtnAgregarCliente.setFont(BtnAgregarCliente.getFont().deriveFont(BtnAgregarCliente.getFont().getSize()+2f));
        BtnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Agregar.png"))); // NOI18N
        BtnAgregarCliente.setText("Agregar");

        BtnEliminarCliente.setFont(BtnEliminarCliente.getFont().deriveFont(BtnEliminarCliente.getFont().getSize()+2f));
        BtnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remover.png"))); // NOI18N
        BtnEliminarCliente.setText("Eliminar");
        BtnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlMantenimientoLayout = new javax.swing.GroupLayout(PnlMantenimiento);
        PnlMantenimiento.setLayout(PnlMantenimientoLayout);
        PnlMantenimientoLayout.setHorizontalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(LblAdministrador)
                            .addComponent(LblImgAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)))
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                .addComponent(BtnAgregarRest)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEliminarRest))
                            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                .addComponent(LblInfoRestaurantes)
                                .addGap(18, 18, 18)
                                .addComponent(LblInfoRest))
                            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                .addComponent(LblAdministradorInfo)
                                .addGap(18, 18, 18)
                                .addComponent(LblInfoAdmin)))
                        .addGap(74, 74, 74)
                        .addComponent(BtnAgregarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEliminarCliente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMantenimientoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        PnlMantenimientoLayout.setVerticalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblImgAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblAdministradorInfo)
                    .addComponent(LblInfoAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblInfoRestaurantes)
                    .addComponent(LblInfoRest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregarRest)
                    .addComponent(BtnEliminarRest)
                    .addComponent(BtnAgregarCliente)
                    .addComponent(BtnEliminarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                .addContainerGap())
        );

        TpnVentanas.addTab("5", PnlMantenimiento);

        PnlInfoUsuario.setBackground(new java.awt.Color(255, 255, 255));

        LblInfoNameUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblInfoNameUser.setForeground(new java.awt.Color(0, 57, 114));
        LblInfoNameUser.setText("Usuario");

        LtlCorreo.setFont(LtlCorreo.getFont().deriveFont(LtlCorreo.getFont().getSize()+6f));
        LtlCorreo.setForeground(new java.awt.Color(0, 57, 114));
        LtlCorreo.setText("Correo :");

        lblInfoCorreo.setFont(lblInfoCorreo.getFont().deriveFont(lblInfoCorreo.getFont().getSize()+2f));
        lblInfoCorreo.setForeground(new java.awt.Color(0, 57, 114));
        lblInfoCorreo.setText("Info 1");

        LTlContra.setFont(LTlContra.getFont().deriveFont(LTlContra.getFont().getSize()+6f));
        LTlContra.setForeground(new java.awt.Color(0, 57, 114));
        LTlContra.setText("Contraseña :");

        LblInfoContra.setFont(LblInfoContra.getFont().deriveFont(LblInfoContra.getFont().getSize()+2f));
        LblInfoContra.setForeground(new java.awt.Color(0, 57, 114));
        LblInfoContra.setText("Info 2");

        LtlTarjeta.setFont(LtlTarjeta.getFont().deriveFont(LtlTarjeta.getFont().getSize()+6f));
        LtlTarjeta.setForeground(new java.awt.Color(0, 57, 114));
        LtlTarjeta.setText("Num.Tarjeta :");

        LblInfoNumTar.setFont(LblInfoNumTar.getFont().deriveFont(LblInfoNumTar.getFont().getSize()+2f));
        LblInfoNumTar.setForeground(new java.awt.Color(0, 57, 114));
        LblInfoNumTar.setText("Info 3");

        LblDecoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblDecoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User Profile.png"))); // NOI18N
        LblDecoUsuario.setToolTipText("");

        LtlRol.setFont(LtlRol.getFont().deriveFont(LtlRol.getFont().getSize()+6f));
        LtlRol.setForeground(new java.awt.Color(0, 57, 114));
        LtlRol.setText("Rol :");

        LblInfoRol.setFont(LblInfoRol.getFont().deriveFont(LblInfoRol.getFont().getSize()+2f));
        LblInfoRol.setForeground(new java.awt.Color(0, 57, 114));
        LblInfoRol.setText("Info 4");

        javax.swing.GroupLayout PnlInfoUsuarioLayout = new javax.swing.GroupLayout(PnlInfoUsuario);
        PnlInfoUsuario.setLayout(PnlInfoUsuarioLayout);
        PnlInfoUsuarioLayout.setHorizontalGroup(
            PnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInfoUsuarioLayout.createSequentialGroup()
                .addGroup(PnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlInfoUsuarioLayout.createSequentialGroup()
                        .addGroup(PnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlInfoUsuarioLayout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(LblInfoNameUser))
                            .addGroup(PnlInfoUsuarioLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(PnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnlInfoUsuarioLayout.createSequentialGroup()
                                        .addComponent(LtlTarjeta)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblInfoNumTar))
                                    .addGroup(PnlInfoUsuarioLayout.createSequentialGroup()
                                        .addComponent(LTlContra)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblInfoContra))
                                    .addGroup(PnlInfoUsuarioLayout.createSequentialGroup()
                                        .addComponent(LtlCorreo)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblInfoCorreo)
                                        .addGap(18, 18, 18)
                                        .addComponent(LtlRol)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblInfoRol)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(LblDecoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlInfoUsuarioLayout.setVerticalGroup(
            PnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInfoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblInfoNameUser)
                .addGap(18, 18, 18)
                .addGroup(PnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LtlCorreo)
                    .addComponent(lblInfoCorreo)
                    .addComponent(LtlRol)
                    .addComponent(LblInfoRol))
                .addGap(18, 18, 18)
                .addGroup(PnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LTlContra)
                    .addComponent(LblInfoContra))
                .addGap(18, 18, 18)
                .addGroup(PnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LtlTarjeta)
                    .addComponent(LblInfoNumTar))
                .addGap(18, 18, 18)
                .addComponent(LblDecoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 358, Short.MAX_VALUE))
        );

        TpnVentanas.addTab("6", PnlInfoUsuario);

        PnlAgregarEditar.setBackground(new java.awt.Color(255, 255, 255));

        LblNombreProducto.setFont(LblNombreProducto.getFont().deriveFont(LblNombreProducto.getFont().getSize()+2f));
        LblNombreProducto.setForeground(new java.awt.Color(0, 57, 114));
        LblNombreProducto.setText("Nombre del Producto :");

        TxtNombreProducto.setFont(TxtNombreProducto.getFont().deriveFont(TxtNombreProducto.getFont().getSize()+2f));
        TxtNombreProducto.setForeground(new java.awt.Color(0, 57, 114));

        LblPrecio.setFont(LblPrecio.getFont().deriveFont(LblPrecio.getFont().getSize()+2f));
        LblPrecio.setForeground(new java.awt.Color(0, 57, 114));
        LblPrecio.setText("Precio :");

        LblPerecedero.setFont(LblPerecedero.getFont().deriveFont(LblPerecedero.getFont().getSize()+2f));
        LblPerecedero.setForeground(new java.awt.Color(0, 57, 114));
        LblPerecedero.setText("Perecedero :");

        LblImpuesto.setFont(LblImpuesto.getFont().deriveFont(LblImpuesto.getFont().getSize()+2f));
        LblImpuesto.setForeground(new java.awt.Color(0, 57, 114));
        LblImpuesto.setText("Impuesto :");

        TxtPrecioProducto.setFont(TxtPrecioProducto.getFont().deriveFont(TxtPrecioProducto.getFont().getSize()+2f));
        TxtPrecioProducto.setForeground(new java.awt.Color(0, 57, 114));

        TxtImpuestoProducto.setFont(TxtImpuestoProducto.getFont().deriveFont(TxtImpuestoProducto.getFont().getSize()+2f));
        TxtImpuestoProducto.setForeground(new java.awt.Color(0, 57, 114));

        BtgTipoEmpacado.add(RdoEmpacado);
        RdoEmpacado.setFont(RdoEmpacado.getFont().deriveFont(RdoEmpacado.getFont().getSize()+2f));
        RdoEmpacado.setForeground(new java.awt.Color(0, 57, 114));
        RdoEmpacado.setText("Empacado");

        BtgTipoEmpacado.add(RdoPreparado);
        RdoPreparado.setFont(RdoPreparado.getFont().deriveFont(RdoPreparado.getFont().getSize()+2f));
        RdoPreparado.setForeground(new java.awt.Color(0, 57, 114));
        RdoPreparado.setText("Prepadaro");

        BtnAgregarProducto.setFont(BtnAgregarProducto.getFont().deriveFont(BtnAgregarProducto.getFont().getSize()+2f));
        BtnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregarProducto.setText("Agregar");
        BtnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarProductoActionPerformed(evt);
            }
        });

        BtnEditarProducto.setFont(BtnEditarProducto.getFont().deriveFont(BtnEditarProducto.getFont().getSize()+2f));
        BtnEditarProducto.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditarProducto.setText("Editar");
        BtnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlAgregarEditarLayout = new javax.swing.GroupLayout(PnlAgregarEditar);
        PnlAgregarEditar.setLayout(PnlAgregarEditarLayout);
        PnlAgregarEditarLayout.setHorizontalGroup(
            PnlAgregarEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAgregarEditarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PnlAgregarEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlAgregarEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PnlAgregarEditarLayout.createSequentialGroup()
                            .addComponent(LblPerecedero)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RdoEmpacado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RdoPreparado))
                        .addGroup(PnlAgregarEditarLayout.createSequentialGroup()
                            .addComponent(LblPrecio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PnlAgregarEditarLayout.createSequentialGroup()
                            .addComponent(LblNombreProducto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtNombreProducto))
                        .addGroup(PnlAgregarEditarLayout.createSequentialGroup()
                            .addComponent(LblImpuesto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtImpuestoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlAgregarEditarLayout.createSequentialGroup()
                        .addComponent(BtnAgregarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        PnlAgregarEditarLayout.setVerticalGroup(
            PnlAgregarEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAgregarEditarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PnlAgregarEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNombreProducto)
                    .addComponent(TxtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlAgregarEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPrecio)
                    .addComponent(TxtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlAgregarEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPerecedero)
                    .addComponent(RdoEmpacado)
                    .addComponent(RdoPreparado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlAgregarEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblImpuesto)
                    .addComponent(TxtImpuestoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                .addGroup(PnlAgregarEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregarProducto)
                    .addComponent(BtnEditarProducto))
                .addContainerGap())
        );

        TpnVentanas.addTab("7", PnlAgregarEditar);

        javax.swing.GroupLayout PnlMantenimientoAdministradorLayout = new javax.swing.GroupLayout(PnlMantenimientoAdministrador);
        PnlMantenimientoAdministrador.setLayout(PnlMantenimientoAdministradorLayout);
        PnlMantenimientoAdministradorLayout.setHorizontalGroup(
            PnlMantenimientoAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        PnlMantenimientoAdministradorLayout.setVerticalGroup(
            PnlMantenimientoAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        TpnVentanas.addTab("8", PnlMantenimientoAdministrador);

        getContentPane().add(TpnVentanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 670, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ColoresBotones() {
        BtnRestaurante.setBackground(new java.awt.Color(255, 255, 255, 1));
        BtnCarritoCompras.setBackground(new java.awt.Color(255, 255, 255, 1));
        BtnGerente.setBackground(new java.awt.Color(255, 255, 255, 1));
        BtnMantenimiento.setBackground(new java.awt.Color(255, 255, 255, 1));
        BtnSalir.setBackground(new java.awt.Color(255, 255, 255, 1));
        BtnMenos.setBackground(new java.awt.Color(0, 114, 255, 255));
        BtnMas.setBackground(new java.awt.Color(0, 114, 255, 255));
        BtnComprarProducto.setBackground(new java.awt.Color(0, 114, 255, 255));
        BtnAgregar.setBackground(new java.awt.Color(0, 114, 255, 255));
        BtnEliminarProductos.setBackground(new java.awt.Color(0, 114, 255, 255));
        TxtNombreProducto.setBackground(new java.awt.Color(255, 255, 255, 1));
        TxtPrecioProducto.setBackground(new java.awt.Color(255, 255, 255, 1));
        TxtImpuestoProducto.setBackground(new java.awt.Color(255, 255, 255, 1));
        BtnAgregarProducto.setBackground(new java.awt.Color(0, 114, 255, 255));
        BtnEditarProducto.setBackground(new java.awt.Color(0, 114, 255, 255));
        BtnEliminarRest.setBackground(new java.awt.Color(0, 114, 255, 255));
        BtnAgregarRest.setBackground(new java.awt.Color(0, 114, 255, 255));
        BtnEliminarCliente.setBackground(new java.awt.Color(0, 114, 255, 255));
        BtnAgregarCliente.setBackground(new java.awt.Color(0, 114, 255, 255));
    }

    private void ActivaroDesactivarRest(boolean bool) {
        LblTipoRestaurante.setVisible(bool);
        CboTipoRestaurante.setVisible(bool);
        LblTipoEmpacado.setVisible(bool);
        RdoPreparadoCompra.setVisible(bool);
        RdoEmpacadoCompra.setVisible(bool);
    }

    private void Informacion() {
        LblInfoNameUser.setText(useradmin.getNombre());
        lblInfoCorreo.setText(useradmin.getCorreo());
        LblInfoContra.setText(useradmin.getConstraseña());
        LblInfoRol.setText(String.valueOf(useradmin.getRol()));
        LblInfoNumTar.setText(useradmin.getNumTarjeta());
    }

    private void llenarRestaurantes() throws Exception {
        CboRestaurante.removeAllItems();
        ArrayList<Negocio> Lista = (ArrayList<Negocio>) Negocio.listadoNegocios();
        for (Negocio negocio : Lista) {
            if (negocio.getTipo().equals(Empresa.RESTAURANTE) && negocio.getTipoRest() == Restaurate) {
                CboRestaurante.addItem(negocio.getNombre());
            }
        }
    }

    private void llenarNegocios() throws Exception {
        CboRestaurante.removeAllItems();
        List<Negocio> Lista = (ArrayList<Negocio>) Negocio.listadoNegocios();
        for (Negocio negocio : Lista) {
            if (negocio.getTipo().equals(Empresa)) {
                CboRestaurante.addItem(negocio.getNombre());
            }
        }
    }

    private void ContadorProductos() throws Exception {
        int contador = 0;
        Negocio negocio = Negocio.consultarNegocio(useradmin.getCorreo());
        List<Producto> lista = negocio.getListaProductos();
        for (Producto producto : lista) {
            if (producto != null) {
                contador++;
            }
        }
        InfoCantidadDeProductos.setText(String.valueOf(contador));
    }

    private void llenarTablasRestaurantes() throws Exception {
        try {
            String nombreRestauranteSeleccionado = (String) CboRestaurante.getSelectedItem();

            ArrayList<Producto> listProd = (ArrayList<Producto>) Producto.listadoProductos();
            modeloTablaProductos.setRowCount(0);  // Limpiar el modelo de la tabla

            Object[] datos = new Object[2];

//        JOptionPane.showMessageDialog(this,"Nombre del restaurante seleccionado: " + nombreRestauranteSeleccionado);  // Mensaje de depuración
            int productosAgregados = 0;  // Contador para verificar cuántos productos se agregan

            for (Producto producto : listProd) {
                if (producto.getNegocio().getNombre().equals(nombreRestauranteSeleccionado)) {
                    datos[0] = producto.getNombre();
                    datos[1] = producto.getPrecio();
                    modeloTablaProductos.addRow(datos);
                    productosAgregados++;  // Incrementar el contador
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al listar el Producto\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
            e.printStackTrace();  // Imprimir la traza de la excepción
        }
    }

    private void llenaTablaDeProductos() {
        try {
            ArrayList<Producto> listProd = (ArrayList<Producto>) Producto.listadoProductos();
            modeloTabla.setRowCount(0);
            Object[] datos = new Object[4];
            HashSet<Producto> setProd = new HashSet<>(listProd);
            for (Producto producto : setProd) {
                if (producto.getNegocio().getNombre().equalsIgnoreCase(Negocio.consultarNegocio(useradmin.getCorreo()).getNombre())) {
                    datos[0] = producto.getNombre();
                    datos[1] = producto.PrecioTotal();
                    datos[2] = producto.getImpuestos();
                    datos[3] = producto.isEmpacado();
                    modeloTabla.addRow(datos);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al listar el Producto\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
        }
    }

    private void llenarAdministrador() {
        try {
            ArrayList<Negocio> listProd = (ArrayList<Negocio>) Negocio.listadoNegocios();
            modeloTablaRest.setRowCount(0);
            Object[] datos = new Object[3];
            HashSet<Negocio> setNeg = new HashSet<>(listProd);
            for (Negocio negocio : setNeg) {
                datos[0] = negocio.getNombre();
                datos[1] = negocio.getTipo();
                datos[2] = negocio.getGerente().getNombre();
                modeloTablaRest.addRow(datos);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al listar los Restaurantes\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
        }
        try {
            ArrayList<Usuario> listProd = (ArrayList<Usuario>) Usuario.listado();
            modeloTablaClientes.setRowCount(0);
            Object[] datos = new Object[3];
            HashSet<Usuario> setUser = new HashSet<>(listProd);
            for (Usuario user : setUser) {
                datos[0] = user.getNombre();
                datos[1] = user.getRol();
                modeloTablaClientes.addRow(datos);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al listar el Producto\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
        }
    }

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        try {
            Login = new login();

        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        Login.setVisible(true);
        CboRestaurante.removeAllItems();
        Utilitario.UtilitarioVentana.fade(Login);
        Utilitario.UtilitarioVentana.fadeOutAndDispose(this);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Utilitario.UtilitarioVentana.fade(this);
        for (TipoEmpresa tipoempresa : TipoEmpresa.values()) {
            CboTipoDeEmpresa.addItem(tipoempresa.getNombreTipo());
        }
        for (TipoRestaurante tipoRestaurante : TipoRestaurante.values()) {
            CboTipoRestaurante.addItem(tipoRestaurante.getTipoRest());
        }
    }//GEN-LAST:event_formWindowOpened

    private void BtnRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestauranteActionPerformed
        TpnVentanas.setSelectedIndex(1);

        try {
            llenarTablasRestaurantes();
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnRestauranteActionPerformed

    private void BtnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMantenimientoActionPerformed
        TpnVentanas.setSelectedIndex(4);
        llenarAdministrador();
    }//GEN-LAST:event_BtnMantenimientoActionPerformed

    private void BtnCarritoComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCarritoComprasActionPerformed
        TpnVentanas.setSelectedIndex(2);
        int montoTotal = 0;
        ArrayList<Producto> listaCompras = user.getListaProductos();
        for (Producto listaProductos : listaCompras) {
            montoTotal += listaProductos.PrecioTotal();
        }
        infoMontoCompra.setText(String.valueOf(montoTotal));
    }//GEN-LAST:event_BtnCarritoComprasActionPerformed

    private void BtnGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerenteActionPerformed
        TpnVentanas.setSelectedIndex(3);
        LblGerente.setText("Gerente : " + useradmin.getNombre());
        try {
            InfoGenteNegocio.setText(Negocio.consultarNegocio(useradmin.getCorreo()).getNombre());
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ContadorProductos();

        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        llenaTablaDeProductos();
    }//GEN-LAST:event_BtnGerenteActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        TpnVentanas.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void LblIconUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblIconUsuarioMouseClicked
        TpnVentanas.setSelectedIndex(5);
        Informacion();
    }//GEN-LAST:event_LblIconUsuarioMouseClicked

    private void CboTipoDeEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboTipoDeEmpresaActionPerformed
        switch (CboTipoDeEmpresa.getSelectedIndex()) {
            case 0:
                LblImagenRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Restaurante.jpg")));
                Empresa = TipoEmpresa.RESTAURANTE;
                ActivaroDesactivarRest(true);
                break;
            case 1:
                LblImagenRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cafeteria.jpg")));
                Empresa = TipoEmpresa.CAFETERIA;
                ActivaroDesactivarRest(false);
                break;
            case 2:
                LblImagenRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Empresa.jpg")));
                Empresa = TipoEmpresa.EMPRESA;
                ActivaroDesactivarRest(false);
                break;
            default:
                break;
        }
        LblSeleccion.setText(CboTipoDeEmpresa.getItemAt(CboTipoDeEmpresa.getSelectedIndex()));
        try {
            llenarNegocios();

        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CboTipoDeEmpresaActionPerformed

    private void BtnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenosActionPerformed
        int Numero = Integer.parseInt(TxtCantidadProductos.getText());
        if (Numero <= 1) {
            JOptionPane.showMessageDialog(this, "No Puede Existir Numeros Negativos");
            TxtCantidadProductos.setText("1");
        } else {
            Numero -= 1;
            TxtCantidadProductos.setText(String.valueOf(Numero));
        }
    }//GEN-LAST:event_BtnMenosActionPerformed

    private void BtnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMasActionPerformed
        int Numero = Integer.parseInt(TxtCantidadProductos.getText());
        Numero += 1;
        TxtCantidadProductos.setText(String.valueOf(Numero));
    }//GEN-LAST:event_BtnMasActionPerformed

    private void CboTipoRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboTipoRestauranteActionPerformed
        switch (CboTipoRestaurante.getSelectedIndex()) {
            case 0:
                Restaurate = TipoRestaurante.COMIDARAPIDA;
                break;
            case 1:
                Restaurate = TipoRestaurante.ITALIANO;
                break;
            case 2:
                Restaurate = TipoRestaurante.ASIATICA;
                break;
            case 3:
                Restaurate = TipoRestaurante.MEXICANA;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Debe Escoger Un tipo de Restaurante");
        }
        try {
            llenarRestaurantes();

        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CboTipoRestauranteActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        TpnVentanas.setSelectedIndex(6);
        BtnAgregarProducto.setVisible(true);
        BtnEditarProducto.setVisible(false);
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void LblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblExitMouseClicked
        Utilitario.UtilitarioVentana.fadeOutAndExit(this);
    }//GEN-LAST:event_LblExitMouseClicked

    private void BtnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarProductoActionPerformed
        boolean empacado = false;
        String nombreProducto = TxtNombreProducto.getText();
        int precioProducto = Integer.parseInt(TxtPrecioProducto.getText());
        Double impuestoProducto = (double) Integer.parseInt(TxtImpuestoProducto.getText()) / 100;

        if (TxtNombreProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes indicar el nombre del producto");
            return;
        }
        if (TxtPrecioProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes indicar el precio del producto");
            return;
        }
        if (TxtImpuestoProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes indicar el impuesto del producto");
            return;
        }
        if (BtgTipoEmpacado.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Debes indicar si el producto es empacado o preparado");
            return;
        }
        if (RdoEmpacado.isSelected()) {
            empacado = true;
        }
        try {
            ProductMantenimiento = new Producto(empacado, nombreProducto, precioProducto, impuestoProducto, Negocio.consultarNegocio(useradmin.getCorreo()));

        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (ProductMantenimiento != null) {
            try {
                Negocio negocio = Negocio.consultarNegocio(useradmin.getCorreo());
                negocio.agregarProducto(ProductMantenimiento);
                // También puedes agregar el producto directamente a la clase Producto
                Producto.agregarProducto(ProductMantenimiento);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el producto\n"
                        + "El programa se cerrará, consulte con el administrador\n"
                        + e.toString());
                System.exit(0);
            }
            llenaTablaDeProductos(); // Actualiza la tabla con el nuevo producto
            TpnVentanas.setSelectedIndex(3);
            try {
                ContadorProductos();

            } catch (Exception ex) {
                Logger.getLogger(MainMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        TxtNombreProducto.setText("");
        TxtPrecioProducto.setText("");
        TxtImpuestoProducto.setText("");
    }//GEN-LAST:event_BtnAgregarProductoActionPerformed

    private void BtnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarProductoActionPerformed
        try {
            if (productoMant != null) {
                // Modificar el producto
                boolean empacado;
                String nombre = TxtNombreProducto.getText();
                int precio = Integer.parseInt(TxtPrecioProducto.getText());
                double impuesto = Double.valueOf(TxtImpuestoProducto.getText());
                if (RdoEmpacado.isSelected()) {
                    empacado = true;
                } else {
                    empacado = false;
                }
                productoMant = new Producto(empacado, nombre, precio, impuesto, SucursalGerente);
                SucursalGerente.modificar(productoMant);
                // Actualizar la tabla con el nuevo producto
                llenaTablaDeProductos();
                // Limpia la selección de la fila en la tabla
                TblGerneteProductos.clearSelection();
                TpnVentanas.setSelectedIndex(3);
            } else {
                JOptionPane.showMessageDialog(this, "Producto no modificado");
            }
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al modificar el Producto\n" + ex.getMessage());
        }
    }//GEN-LAST:event_BtnEditarProductoActionPerformed

    private void BtnEliminarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarProductosActionPerformed
        if (TblGerneteProductos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el departamento a eliminar");
            return;
        } else {
            String NombreProducto = TblGerneteProductos.getValueAt(TblGerneteProductos.getSelectedRow(), 0).toString();
            try {
                Producto.eliminarProducto(NombreProducto);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el Producto\n"
                        + "el programa se cerrará consulte con el administrador\n"
                        + e.toString());
                System.exit(0);
            }
            llenaTablaDeProductos();
        }
    }//GEN-LAST:event_BtnEliminarProductosActionPerformed

    private void CboRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboRestauranteActionPerformed
        try {
            llenarTablasRestaurantes();
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CboRestauranteActionPerformed

    private void BtnComprarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarProductoActionPerformed
        try {
            // Obtener el nombre del producto y el nombre del restaurante seleccionado
            String nombreProducto = (String) TblRestauranteProductos.getValueAt(TblRestauranteProductos.getSelectedRow(), 0);
            String nombreRestauranteSeleccionado = (String) CboRestaurante.getSelectedItem();

            // Buscar el producto en los archivos (asumiendo que los archivos son la fuente de datos)
            Producto productoEncontrado = null;
            for (Producto producto : Producto.listadoProductos()) {
                if (producto.getNombre().equals(nombreProducto) && producto.getNegocio().getNombre().equals(nombreRestauranteSeleccionado)) {
                    productoEncontrado = producto;
                    productoEncontrado.setCantidad(Integer.parseInt(TxtCantidadProductos.getText()));
                    break;  // Salir del bucle una vez que se encuentre el producto
                }
            }
//            modeloTablaCarrito.setRowCount(0);
            // Verificar si se encontró el producto
            if (productoEncontrado != null) {
                // Agregar el producto al array de productos del usuario (asumiendo que tienes un array llamado productosUsuario)
                user.agregrarCarrito(productoEncontrado);

                // Agregar el producto a la tabla (si es necesario)
                Object[] datos = new Object[3];
                datos[0] = productoEncontrado.getNombre();
                datos[1] = productoEncontrado.getCantidad();
                datos[2] = productoEncontrado.getPrecio();
                modeloTablaCarrito.addRow(datos);
                JOptionPane.showMessageDialog(this, "Producto agregado al carrito de compras del usuario");
                BtnCarritoCompras.setVisible(true);
                TxtCantidadProductos.setText("1");
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado para el restaurante seleccionado");
            }

        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnComprarProductoActionPerformed

    private void BtnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarClienteActionPerformed
        if (TblClientes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el Cliente a eliminar");
            return;
        } else {
            String NombreCliente = TblClientes.getValueAt(TblClientes.getSelectedRow(), 0).toString();
            try {
                Usuario.eliminar(NombreCliente);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar al usuario\n"
                        + "el programa se cerrará consulte con el administrador\n"
                        + e.toString());
                System.exit(0);
            }
            llenarAdministrador();
        }
    }//GEN-LAST:event_BtnEliminarClienteActionPerformed

    private void BtnEliminarRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarRestActionPerformed
        if (TblRestaurantes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el Cliente a eliminar");
            return;
        } else {
            String NombreCliente = TblRestaurantes.getValueAt(TblRestaurantes.getSelectedRow(), 0).toString();
            try {
                Negocio.eliminarDepartamento(NombreCliente);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el Negocio\n"
                        + "el programa se cerrará consulte con el administrador\n"
                        + e.toString());
                System.exit(0);
            }
            llenarAdministrador();
        }
    }//GEN-LAST:event_BtnEliminarRestActionPerformed

    private void BtnPagarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPagarComprasActionPerformed
        JOptionPane.showMessageDialog(this, "Gracias por tu compra vuelve pronto : "+user.getNombre());
        modeloTablaCarrito.setRowCount(0);
        user.setListaProductos(new ArrayList<>());
        TpnVentanas.setSelectedIndex(0);
    }//GEN-LAST:event_BtnPagarComprasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainMenu().setVisible(true);

                } catch (Exception ex) {
                    Logger.getLogger(MainMenu.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void setProductMantenimiento(Producto ProductMantenimiento) {
        this.ProductMantenimiento = ProductMantenimiento;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtgTipoEmpacado;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAgregarCliente;
    private javax.swing.JButton BtnAgregarProducto;
    private javax.swing.JButton BtnAgregarRest;
    private javax.swing.JButton BtnCarritoCompras;
    private javax.swing.JButton BtnComprarProducto;
    private javax.swing.JButton BtnEditarProducto;
    private javax.swing.JButton BtnEliminarCliente;
    private javax.swing.JButton BtnEliminarProductos;
    private javax.swing.JButton BtnEliminarRest;
    private javax.swing.JButton BtnGerente;
    private javax.swing.JButton BtnMantenimiento;
    private javax.swing.JButton BtnMas;
    private javax.swing.JButton BtnMenos;
    private javax.swing.JButton BtnPagarCompras;
    private javax.swing.JButton BtnRestaurante;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CboRestaurante;
    private javax.swing.JComboBox<String> CboTipoDeEmpresa;
    private javax.swing.JComboBox<String> CboTipoRestaurante;
    private javax.swing.JLabel InfoCantidadDeProductos;
    private javax.swing.JLabel InfoGenteNegocio;
    private javax.swing.JLabel LTlContra;
    private javax.swing.JLabel LblAdministrador;
    private javax.swing.JLabel LblAdministradorInfo;
    private javax.swing.JLabel LblCantidad;
    private javax.swing.JLabel LblCarritoCompras;
    private javax.swing.JLabel LblDecoUsuario;
    private javax.swing.JLabel LblExit;
    private javax.swing.JLabel LblGerente;
    private javax.swing.JLabel LblIconUsuario;
    private javax.swing.JLabel LblImagenRestaurante;
    private javax.swing.JLabel LblImgAdmin;
    private javax.swing.JLabel LblImgDefault;
    private javax.swing.JLabel LblImgGerente;
    private javax.swing.JLabel LblImpuesto;
    private javax.swing.JLabel LblInfoAdmin;
    private javax.swing.JLabel LblInfoContra;
    private javax.swing.JLabel LblInfoNameUser;
    private javax.swing.JLabel LblInfoNumTar;
    private javax.swing.JLabel LblInfoRest;
    private javax.swing.JLabel LblInfoRestaurantes;
    private javax.swing.JLabel LblInfoRol;
    private javax.swing.JLabel LblNombreProducto;
    private javax.swing.JLabel LblNumeroDeProductos;
    private javax.swing.JLabel LblPerecedero;
    private javax.swing.JLabel LblPrecio;
    private javax.swing.JLabel LblProductos;
    private javax.swing.JLabel LblRestauranteCargo;
    private javax.swing.JLabel LblSeleccion;
    private javax.swing.JLabel LblTipoEmpacado;
    private javax.swing.JLabel LblTipoEmpresa;
    private javax.swing.JLabel LblTipoRestaurante;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel LtlCorreo;
    private javax.swing.JLabel LtlRol;
    private javax.swing.JLabel LtlTarjeta;
    private javax.swing.JPanel PnlAgregarEditar;
    private javax.swing.JPanel PnlCarritoCompras;
    private javax.swing.JPanel PnlDefault;
    private javax.swing.JPanel PnlGerente;
    private javax.swing.JPanel PnlInfoUsuario;
    private javax.swing.JPanel PnlMantenimiento;
    private javax.swing.JPanel PnlMantenimientoAdministrador;
    private javax.swing.JPanel PnlRestaurante;
    private javax.swing.JPanel PnlUsuario;
    private javax.swing.JRadioButton RdoEmpacado;
    private javax.swing.JRadioButton RdoEmpacadoCompra;
    private javax.swing.JRadioButton RdoPreparado;
    private javax.swing.JRadioButton RdoPreparadoCompra;
    private javax.swing.JTable TblCarritoCompras;
    private javax.swing.JTable TblClientes;
    private javax.swing.JTable TblGerneteProductos;
    private javax.swing.JTable TblRestauranteProductos;
    private javax.swing.JTable TblRestaurantes;
    private javax.swing.JTabbedPane TpnVentanas;
    private javax.swing.JTextField TxtCantidadProductos;
    private javax.swing.JTextField TxtImpuestoProducto;
    private javax.swing.JTextField TxtNombreProducto;
    private javax.swing.JTextField TxtPrecioProducto;
    private javax.swing.JLabel infoMontoCompra;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblInfoCorreo;
    // End of variables declaration//GEN-END:variables
}
