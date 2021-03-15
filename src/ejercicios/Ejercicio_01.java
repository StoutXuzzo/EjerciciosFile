/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author stout
 */
public class Ejercicio_01 {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        File ruta = null;
        String input="";
        do{
            System.out.println(" - INTRODUCE LA RUTA -");
            input = tec.nextLine();
            ruta = new File(input);
            tec.reset();
            try{
                if (!input.equals("")) muestraInfoRuta(ruta);
                else System.out.println("Hasta la proxima");
            }catch(FileNotFoundException x){
                System.out.println(x);
            }
            System.out.println("");
        }while(!input.equals(""));
    }
    
    public static void muestraInfoRuta(File ruta) throws FileNotFoundException{
        if(!ruta.exists()) throw new FileNotFoundException("La direccion es incorrecta"); 
        if(ruta.isFile()){
            System.out.println("\nEs un archivo con nombre: " + ruta.getName());
        }
        else{
            File[] lista = ruta.listFiles();
            System.out.println("\nDirectorios: ");
            for(int i = 0 ; i < lista.length ; i++)
                if (lista[i].isDirectory()) System.out.println("[*] - " + lista[i].getName());
            System.out.println("\nArchivos:");
            for(int i = 0; i < lista.length ; i++)
                if (lista[i].isFile()) System.out.println("[A] - " + lista[i].getName());
        }
    }
}
