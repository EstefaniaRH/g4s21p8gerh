/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import g4s21p8gerh.Datos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estef
 */
public class Archivo {
    public List<Datos> leerDatos(){
        List<Datos> listdatos = new ArrayList<>();
        String cadena;
        try{
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(archivo);
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return listdatos;
    }
}
