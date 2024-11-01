package org.Animal;

public class Animal {

    public String nombre;
    public int edad;

    public Animal(String nom, int age){
        this.nombre = nom;
        this.edad = age;
    }
    /*public Animal(String nombre) {
        this.nombre = nombre;
    }*/

    public String hacerSonido(){
        return "Sonido";
    }

}
