/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDatos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Usuario
 */
public class MiObjectOutputStream extends ObjectOutputStream {

    public MiObjectOutputStream(OutputStream out)
            throws IOException {
            super(out);
    }
    
    //redefinir el metodo que escribe los encabezados (sobrescribe)de manera que
    //cuando ya exista el archivo no grabe encabezados cada vez de grabar un objeto
    @Override
    protected void writeStreamHeader() throws IOException{
        
    }
    
    
}
