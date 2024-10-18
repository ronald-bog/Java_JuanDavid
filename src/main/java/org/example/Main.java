// github Juan David: PilotK300
package org.example;

public class Main {

    public static void main(String[] args) {
        // STRINGS
        String nombre = "Juan";
        String nombre1 = new String("Hola Juan");

        // Manejo de indices

        // METODOS
        // lenght():
        int longitud = nombre.length();
        System.out.println(longitud );

        // charAt
        System.out.println(nombre.charAt(2));

        // substring
        System.out.println(nombre.substring(1,3));

        String nombre3 = "Juan";
        //indexOf
        System.out.println(nombre3.indexOf("u"));

        // toLowerCase toUpperCase
        System.out.println(nombre3.toUpperCase());

        // trim()
        String nombre4 = " Juan ";
        System.out.print(nombre4.trim());
        System.out.print("**********");
    }
}












