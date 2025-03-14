package org.herencia;

public class Herencia_H extends Herencia_P {

    private String sede;

    public Herencia_H(String nombre, int codigo, String sede) {
        super(nombre, codigo);
        this.sede = sede;
    }

    @Override
    public void evaluar() {
        System.out.println("He sido modificado en la subclase");
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
