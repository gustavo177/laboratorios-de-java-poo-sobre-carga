package org.gustavo.poosobrecarga;
import  static org.gustavo.poosobrecarga.Calculadora.*;
public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("sumar int : " + sumar(10, 5));
        System.out.println("sumar float : " + sumar(10.0F, 5F));
        System.out.println("sumar float-int : " + sumar(10.0F, 5));
        System.out.println("sumar int-float : " + sumar(10, 5.0F));
        System.out.println("sumar double : " + sumar(10.0, 5.0));
        System.out.println("sumar string : " + sumar("10", "5"));
        System.out.println("sumar tres int : " + sumar(10, 5, 2));

        System.out.println("sumar 4 int : " + sumar(10, 5, 5, 5));
        System.out.println("sumar 6 int : " + sumar(10, 5, 5, 5, 1, 2));
        System.out.println("sumar 1 float  n int : " + sumar(10.5F, 5, 5, 5, 1, 2));
        System.out.println("sumar 3 double : " + sumar(10.5, 5.6, 5.4, 5.1));

        System.out.println("sumar long : " + sumar(10L, 5L));
        System.out.println("sumar long : " + sumar(10, '@'));
        System.out.println("sumar long : " + sumar(10F, '@'));

    }
}
