/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.File;

/**
 *
 * @author stout
 */
public class Ejercicio_04 {
    public static void main(String[]args){
        File misCosas = new File("D:\\Ejercicio\\Documentos\\Mis Cosas");
        File alfabeto = new File("D:\\Ejercicio\\Documentos\\Alfabeto");
        misCosas.mkdir();
        alfabeto.mkdir();
        
        File fotografias = new File("D:\\Ejercicio\\Fotografias");
        File libros = new File("D:\\Ejercicio\\Libros");
        fotografias.renameTo(new File(misCosas + "\\" + fotografias.getName()));
        libros.renameTo(new File(misCosas + "\\" + libros.getName()));
        
        for(int i = 65; i <= 90; i++){
            new File(alfabeto.getAbsolutePath() + "\\" + Character.toString((char) i)).mkdir();
        }
            
    }
}
