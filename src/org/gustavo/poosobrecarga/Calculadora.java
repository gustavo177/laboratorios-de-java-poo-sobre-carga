package org.gustavo.poosobrecarga;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    public int sumar(int... argumentos){
        int total = 0;
        for(int i: argumentos){
            total+=i;
        }
        return total;
    }
    public float sumar(float a, int... argumentos){
        float total = a;
        for(int i: argumentos){
            total+=i;
        }
        return total;
    }

    public double sumar(double... varargs){
        double total=0.0;
        for(double d: varargs){
            total+=d;
        }
        return total;
    }

    public float sumar(float aa, float bb) {
        return aa + bb;
    }

    public float sumar(int i, float j) {
        return i + j;
    }

    public float sumar(float j, int i) {
        return j + i;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(String a, String b) {
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }

    public double sumar(double a, double b, double c) {
        return a + b + c;
    }
}
