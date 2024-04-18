/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilitario;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Usuario
 */
public class UtilitarioVentana {

    //Para crear un JFrame centrado en pantalla y que se pueda maximizar
    public static void centrarVentanaJFrame(JFrame pVentanaFrame,
            boolean pEstadoMaximizado) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = pVentanaFrame.getSize();

        if (pEstadoMaximizado) {
            pVentanaFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } else {
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            pVentanaFrame.setLocation((screenSize.width - frameSize.width) / 2,
                    (screenSize.height - frameSize.height) / 2);
        }

        GroupLayout layout = new GroupLayout(pVentanaFrame.getContentPane());
        pVentanaFrame.getContentPane().setLayout(layout);
        pVentanaFrame.setVisible(true);
    }

    public static void cerrarPanel(JPanel oPanel) {
        //Para cerrar un panel se debe buscar el padre, los paneles tienen
        //5 niveles en el getComponent(x) por medio de jerarquia
        for (int i = 0; i < oPanel.getParent().getParent().getParent().getParent()
                .getParent().getComponentCount(); i++) {
            if (oPanel.getParent().getParent().getParent().getParent().getParent()
                    .getComponent(i).getClass() == JInternalFrame.class) {
                ((JInternalFrame) oPanel.getParent().getParent().getParent()
                        .getParent().getParent().getComponent(i)).dispose();
                return;
            } else if (oPanel.getParent().getParent().getParent().getParent()
                    .getParent().getComponent(i).getClass() == JFrame.class) {
                ((JFrame) oPanel.getParent().getParent().getParent().getParent()
                        .getParent().getComponent(i)).dispose();
                return;
            }
        }
    }

    public static void centrarVentanaJPanel(JFrame pVentanaPrincipal,
            String pTituloVentana,
            JPanel pPanel,
            JDesktopPane pAdministrador) {
        //Crear una instancia de JInternalFrame es un tipo de ventana
        JInternalFrame oJInteranlFrame = new JInternalFrame(pTituloVentana,
                false, true,
                false, false);

        //ajustamos las dimensiones de la ventana al jdesktopPane
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = pVentanaPrincipal.getSize();

        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        //agrega el panel a la ventana
        oJInteranlFrame.add(pPanel);

        //define la operación de salir de la ventana
        oJInteranlFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        oJInteranlFrame.pack();

        //ubicamos la ventana en el centro del jdesktopPane
        oJInteranlFrame.setLocation(
                (frameSize.width - oJInteranlFrame.getSize().width) / 2,
                (frameSize.height - oJInteranlFrame.getSize().height) / 2);

        //agregamos la ventana al escritorio
        pAdministrador.add(oJInteranlFrame);
        //mostramos la ventana
        oJInteranlFrame.setVisible(true);
    }

    public static void autoResizeColumns(JTable table) {
        //Modelo de columnas de la tabla
        TableColumnModel columModel = table.getColumnModel();
        TableModel modeloTabla = table.getModel();

        for (int colum = 0; colum < table.getColumnCount(); colum++) {
            int width = 0;
            for (int row = 0; row < table.getRowCount(); row++) {
                //definir el ancho de la celda
                int cellWidth = table.getCellRenderer(row, colum)
                        .getTableCellRendererComponent(table,
                                modeloTabla.getValueAt(row, colum),
                                true, true, row, colum)
                        .getPreferredSize().width;
                width = Math.max(width, cellWidth);
            }
            columModel.getColumn(colum).setPreferredWidth(width);
        }
    }

    public static void fade(JFrame componente) {
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            componente.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void fadeOutAndClose(JFrame componente) {
        for (double i = 1.0; i >= 0.0; i = i - 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            componente.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Cerrar la ventana después de la animación
        componente.dispose();
    }

    public static void fadeOutAndExit(JFrame componente) {
        for (double i = 1.0; i >= 0.0; i = i - 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            componente.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Cerrar la ventana después de la animación
        System.exit(0);
    }

    public static void fadeOutAndDispose(JFrame componente) {
        for (double i = 1.0; i >= 0.0; i = i - 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            componente.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Cerrar la ventana después de la animación
        componente.dispose();
    }

    public static void fadeOutAndClosing(JFrame componente) {
        for (double i = 1.0; i >= 0.0; i = i - 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            componente.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Cerrar la ventana después de la animación
        componente.setVisible(false);
    }

    public static void fadeRegistro(JFrame componente) {
        componente.dispose();
        JFrame nuevoComponente = new InterfazGrafica.login();
        nuevoComponente.setVisible(true); // Muestra el nuevo JFrame
    }
}
