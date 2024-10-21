package org.example;

import java.util.Scanner;

public class J04_strings {
    // STRINGS
    String nombre = "Juan";
    String nombre1 = new String("Hola Juan");

    // Manejo de indices

    // METODOS
    // lenght():
    int longitud = nombre.length();
      //  System.out.println(longitud);

    // charAt
      //  System.out.println(nombre.charAt(2));

    // substring
       // System.out.println(nombre.substring(1, 3));

    String nombre3 = "Juan";
    //indexOf
      //  System.out.println(nombre3.indexOf("u"));

    // toLowerCase toUpperCase
        //System.out.println(nombre3.toUpperCase());

    // trim()
    String nombre4 = " Juan ";
//        System.out.print(nombre4.trim());
//        System.out.println("**********");

    // replace
    String nuevoNombre3 = nombre3.replace('a', 'i');
//        System.out.println(nuevoNombre3);
//        System.out.println(nombre3);

    // split
    String direccion = "Carrera&30&Norte";
    String[] direccionDividida = direccion.split("&");
        //System.out.println(direccionDividida);

    // IMPRESION DE STRINGS

    //String apellido = "Ramos";
    //int age = 18;

    // concatenacion
    //String mensaje = "Hola, mi apellido es " + apellido + " y tengo " + age + " años";
    //System.out.println(mensaje);

    // String.format()
    //String messageF = String.format("Hola, mi apellido es %s y tengo %d años", apellido, age);
    //System.out.println(messageF);

    // Marcadores de posicion o especificadores
    //%s: Cadena (String)
    //%d: Entero decimal (int)
    //%f: Número de punto flotante (float o double) %.2f
    //%c: Carácter (char)
    //%b: Booleano (boolean)
    //%n: Inserta un separador de línea

    // Text Blocks
    String apellido = "Ramos";
    int age = 18;
    String messageB =
            """
            Hola,
            mi apellido es %s
            y tengo %d años.
            """.formatted(apellido,age);
    //System.out.println(messageB);

    // SCANNER

    Scanner sc = new Scanner(System.in);
       // System.out.println("Ingresa tu nombre:");
    String nombreAlumno = sc.nextLine();
       // System.out.print("dame tu edad: ");
    int edad = sc.nextInt();
       // System.out.println(nombreAlumno + " " + edad);
      //  sc.close();

}
