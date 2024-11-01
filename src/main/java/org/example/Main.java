// github Juan David: PilotK300
package org.example;

import org.Animal.Animal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Animal perro2 = new Animal();
        perro2.nombre = "Firulais";
        perro2.edad = 5;

        Animal gato2 = new Animal();
        gato2.nombre = "Roger";
        gato2.edad = 6;*/

        Animal perro3 = new Animal("Paco", 10);
        System.out.println(perro3.hacerSonido());

        perro3.hacerSonido();

        System.out.println(perro3.nombre);
        System.out.println(perro3.edad);
        //System.out.println(gato2.nombre);
        //System.out.println(gato2.edad);



    }

}












