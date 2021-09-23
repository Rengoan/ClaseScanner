/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasescanner;

import java.util.Scanner;

/**
 *
 * @author Lukelar
 */
public class ClaseScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
//        Instanciamos un nuevo objeto de la clase Scanner
//        y le pasamos como parametro el metodo System.in para que le de la consola
//        el texto que escribamos
        Scanner lectura = new Scanner(System.in);
//        Usamos el metodo NextLine() para leer de la consola una linea entera
        var nombre = lectura.nextLine();
        System.out.println("Tu nombre: " + nombre);
    }
}
