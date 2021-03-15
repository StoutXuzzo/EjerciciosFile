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
public class Ejercicio_03 {
    public static void main(String[]args){
        
        File documentos = new File("D:\\Ejercicio\\Documentos");
        documentos.renameTo(new File("D:\\Ejercicio\\DOCS"));
        
        File fotografias = new File("D:\\Ejercicio\\Fotografias");
        File fotografias2 = new File("D:\\Ejercicio\\FOTOS");
        fotografias.renameTo(fotografias2);
        fotografias.delete();
        File[] fotos = fotografias2.listFiles();
        for(int i = 0; i < fotos.length; i++){
            fotos[i].renameTo(new File(fotos[i].getParent() + "\\" + fotos[i].getName().replace(".jpg", "")));
        }
        
        File libros = new File("D:\\Ejercicio\\Libros");
        File libros2 = new File("D:\\Ejercicio\\LECTURAS");
        libros.renameTo(libros2);
        libros.delete();
        File[] lecturas = libros2.listFiles();
        for(int i = 0; i < lecturas.length; i++){
            lecturas[i].renameTo(new File(lecturas[i].getParent() + "\\" + lecturas[i].getName().replace(".txt", "")));
        }
    }
}
