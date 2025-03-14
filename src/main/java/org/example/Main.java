// github Juan David: PilotK300
package org.example;

import org.Animal.Animal;
import org.herencia.Herencia_H;
import org.herencia.Herencia_P;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Herencia_P superClase = new Herencia_P("Carlos", 23456);

        Herencia_H subclase = new Herencia_H("Juan David", 646464, "Septima");
        System.out.println(subclase.getNombre());
        System.out.println(subclase.getCodigo());
        System.out.println(subclase.getSede());

        subclase.setNombre("Juan");
        subclase.setCodigo(8754);
        subclase.setSede("Carrera 45");

        System.out.println(subclase.getNombre());
        System.out.println(subclase.getCodigo());
        System.out.println(subclase.getSede());

        superClase.evaluar();
        subclase.evaluar();

    }

}












