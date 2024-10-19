/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionDB;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author david
 */
public class crudDB {
    
    
    public boolean escrituraDB (String nombreDB, String contenido)
    {
        
           boolean estadoEscritura = false;
           String carpetaProyecto = "BD";
           String nombreArchivo = nombreDB+ ".txt";
           File carpeta = new File (carpetaProyecto);
           File f = new File (carpeta, nombreArchivo);
            
            try {
                        FileWriter fw = new FileWriter(f, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write (contenido+"\n");
                        bw.close();
                    } catch (IOException ex) {
  
    System.out.println ("Error:" + ex);
}
            
            return estadoEscritura;
    }    

    public boolean escrituraDB(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}  

