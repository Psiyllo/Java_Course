package start_marathon_metodos.test;

import start_marathon_metodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num = 16;
        int num2 = 32;
        calculadora.MultiplicaDoisNumeros(num, num2);
        System.out.println(calculadora);
    }
}
