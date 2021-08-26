/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractica;

import java.util.Scanner;

/*
    Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt).
 */
/**
 *
 * @author Danny
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String seleccionUsuario, frase;
        System.out.println("Ingrese la frase");
        frase = reader.nextLine();
        System.out.println("Inserte 1 para transformar a mayuscula y 2 para transformar a minuscula");
        seleccionUsuario = reader.nextLine();
        switch (seleccionUsuario) {
            case "1":
                TransformarAMayuscula(frase);
                break;
            case "2":
                TransformarAMinuscula(frase);
                break;
            default:
                System.out.println("La opcion no se encuentra disponible");
                break;
        }
    }

    public static void Proceso() {
        String frase = "La lluvia en Sevilla es una maravilla";
        int contadorVocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            if ("a".equals(String.valueOf(frase.charAt(i))) || "e".equals(String.valueOf(frase.charAt(i))) || "i".equals(String.valueOf(frase.charAt(i))) || "o".equals(String.valueOf(frase.charAt(i))) || "u".equals(String.valueOf(frase.charAt(i)))) {
                contadorVocales++;
            }
        }
        System.out.println("El numero de vocales es: " + contadorVocales);
    }

    public static void Proceso2() {
        String frase = "La lluvia en Sevilla es una maravilla";
        int contadorVocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            System.out.print((int) frase.charAt(i) + " ");
        }
    }

    public static void TransformarAMayuscula(String frase) {
        System.out.println("La frase es: " + frase);
        frase = frase.toUpperCase();
        System.out.println(frase);
    }

    public static void TransformarAMinuscula(String frase) {
        System.out.println("La frase es: " + frase);
        frase = frase.toLowerCase();
        System.out.println(frase);
    }
}
