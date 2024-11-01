package org.paquete1;

/* Modificador   Clase    Paquete   Subclase  Otro_Paquete
 *   private        OK
 *   default        OK        OK  mismo package
 *   protected      OK        OK       OK    solo sublclases
 *   public         OK        OK       OK           OK              */


public class Clase1 {
    private String atributoB;
    private static String atributoS = "Atributo static de clase1";

    public void encapsulamiento(){
        atributo = "";
        atributoS = "HolaS";
    }

    public String getAtributo() {
        return atributoB;
    }

//    public void setAtributo(String atributo) {
//        this.atributo = atributo;
//    }

    public static String getAtributoS() {
        return atributoS;
    }

    public static void setAtributoS(String atributoS) {
        Clase1.atributoS = atributoS;
    }
}
