// github Juan David: PilotK300
package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int resultado = multiplicar(2,2,2);
        System.out.println(resultado);
    }

    // Metodo Void sin parametros
    public static void metodoVoidSinParams() {
        System.out.println("Soy un metodo void sin parametros");
    }

    // Metodo void con parametros
    public static void sumar(int numero1, int otroNumero) {
        System.out.println(numero1 + otroNumero);
    }

    // Metodo con retorno y sin parametros
    public static int sumarR(){
        int a = 5;
        int b = 10;
        return a + b;
    }

    // Metodo con retorno y con parametros
    public static int multiplicar(int n1, int n2, int n3){
        int multi = n1 * n2 * n3;
        return multi;
    }
}












