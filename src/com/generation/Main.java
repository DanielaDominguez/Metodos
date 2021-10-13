package com.generation;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String mensaje = saludar("Daniela");
        System.out.println(mensaje);
        int resutlado = suma(5,3);
        System.out.println(resutlado);
        alerta("mensaje de prueba");
        //Scanner sc = new Scanner(System.in);
        */

        //---------------------------
        //operaciones con la libreria math
//        System.out.println(Math.PI);
//        double num1 = 13.75;
//        double num2 = 23.12;
//
//        System.out.println(Math.ceil(num1)); /*redondea el num1*/
//        System.out.println(Math.ceil(num2)); /*redondea el num2*/
//        System.out.println(Math.sqrt(num1)); /*saca la raíz del num1*/

        String mensaje1 = "Hola";
        String mensaje2 = "Adios!!!";
        // length nos devuelve el número de caracteres de un string
        System.out.println(mensaje2.length());
        // equals compara dos strings y devuelve verdadero si son iguales
        // equalsIgnoreCase compara dos strings sin importar si están escritas en mayúsculas o minúsculas
        System.out.println(mensaje1.equals(mensaje2));

        System.out.println(mensaje1.toUpperCase());
    }

    public static String saludar (String nombre) {
        return "Hola, como estas " + nombre;
    }
    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public static void alerta(String mensaje) {
        System.out.println(mensaje);
    }
    
}
