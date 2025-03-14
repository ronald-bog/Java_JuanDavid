package org.herencia;

public class Herencia_P {

    public Herencia_P(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    private String nombre;
    private int codigo;

    public void evaluar() {
        System.out.println("Este metodo es para evaluar");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
