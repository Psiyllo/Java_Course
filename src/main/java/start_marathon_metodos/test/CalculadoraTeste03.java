package start_marathon_metodos.test;

import start_marathon_metodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaArray(new int[]{1,2,3,4,5});
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
