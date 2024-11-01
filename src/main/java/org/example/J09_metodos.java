package org.example;

public class J09_metodos {

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

    // Otros tipos de metodos con parametros
    // Varargs (...)

    public static void sumar(int... numeros){
        int suma = 0;
        for (int numero: numeros){
            suma += numero;
        }
        System.out.println(suma);
    }

    // Metodos Sobrecargados
    public static void metodoA(String palabra){
        System.out.printf("Primer parametro: %s", palabra);
    }

    public static void metodoA(String palabra, String palabra2){
        System.out.printf("Primer parametro: %s \n", palabra);
        System.out.printf("Segundo parametro: %s", palabra2);
    }

    // Parametros Genericos
    public static <T> void generico(T numero){
        System.out.println(numero);
    }

    // Retorno Generico
    public static <T> T retornoGen(T elem){
        return elem;
    }

}
