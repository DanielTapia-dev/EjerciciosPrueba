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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String numeroUsuario="0";
        double suma=0, mayor=0, menor=0, sumaPositivos=0, sumaNegativos=0, media=0;
        int contador=-1;
        do {            
            
            if(Double.parseDouble(numeroUsuario)<menor){
                menor = Double.parseDouble(numeroUsuario);
            }
            
            if(Double.parseDouble(numeroUsuario)>mayor){
                mayor = Double.parseDouble(numeroUsuario);
            }
            
            suma=suma+Double.parseDouble(numeroUsuario);
            
            if(Double.parseDouble(numeroUsuario)>=0){
                sumaPositivos=sumaPositivos+Double.parseDouble(numeroUsuario);
            }
            
            if(Double.parseDouble(numeroUsuario)<0){
                sumaNegativos=sumaNegativos+Double.parseDouble(numeroUsuario);
            }
            contador++;
            
            media=suma/contador;
            numeroUsuario = reader.nextLine();
        } while (!("-1".equals(numeroUsuario)));
        
        System.out.println("El menor de los numeros es: " + menor);
        System.out.println("El mayor de los numeros es: " + mayor);
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La suma de los numeros positivos es: " + sumaPositivos);
        System.out.println("La suma de los numeros negativos es: " + sumaNegativos);
        System.out.println("La media de los numeros es: " + media);
    }
}
