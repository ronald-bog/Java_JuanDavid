// github Juan David: PilotK300
package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // while
//        int numero = 0;
//        while(numero < 5){
//            System.out.println(numero);
//            numero++;
//        }

        // while con break
//        int numero = 0;
//        while(numero < 10){
//            if (numero == 5){
//                break;
//            }
//            System.out.println(numero);
//            numero++;
//        }

        // while con continue
        int numero = 0;

        while (numero < 9) {
            numero++;
            if (numero == 5) {
                continue;
            }
            System.out.println(numero);
        }
    }
}












