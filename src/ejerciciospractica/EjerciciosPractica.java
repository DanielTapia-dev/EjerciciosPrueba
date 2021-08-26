/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Danny
 */
public class EjerciciosPractica {
    /*1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
    resta, multiplicación, división y módulo (resto de la división).*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proceso();
    }
    
    public static void Proceso(){
        Scanner reader = new Scanner(System.in);
        int suma, resta, multiplicacion, division, modulo;
        String a, b;
        System.out.println("Ingresa la variable a");
        a = reader.nextLine();
        System.out.println("Ingresa la variable b");
        b = reader.nextLine();
        suma = Integer.parseInt(a)+Integer.parseInt(b);
        resta = Integer.parseInt(a)-Integer.parseInt(b);
        multiplicacion = Integer.parseInt(a)*Integer.parseInt(b);
        division = Integer.parseInt(a)/Integer.parseInt(b);
        modulo = Integer.parseInt(a)%Integer.parseInt(b);
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("La modulo es: " + modulo);
    }
    
}
