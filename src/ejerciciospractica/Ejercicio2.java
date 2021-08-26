/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractica;

/**
 *
 * @author Danny
 */
public class Ejercicio2 {
    //Buscar los numero divisibles entre 2 y 3 que existan en el intervalo de [1,100]
    public static void main(String[] args) {
        Proceso();
    }
    
    public static void Proceso() {
        System.out.println("Numeros divisibles para 2");
        for (int i = 1; i <= 100; i++) {
            if (i%2==0) {
                if (i==100) {
                  System.out.print(i);  
                }else{
                  System.out.print(i+",");   
                }
            }
        }
        System.out.println("");
        System.out.println("Numeros divisibles para 3");
        for (int i = 1; i <= 100; i++) {
            if (i%3==0) {
                if (i>=99) {
                  System.out.print(i);  
                }else{
                  System.out.print(i+",");   
                }
            }
        }
    }
}
