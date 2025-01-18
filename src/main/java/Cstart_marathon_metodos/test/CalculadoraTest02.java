package Cstart_marathon_metodos.test;

import Cstart_marathon_metodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.MultiplicaDoisNumeros(23, 76);
        System.out.println(result);

        Calculadora calculadora1 = new Calculadora();
        double result1 = calculadora1.DivideDoisNumeros(20, 10);
        System.out.println(result1);
    }
}
