package start_marathon_metodos.test;

import start_marathon_metodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.SomaDoisNumeros();
        System.out.println("Finalizando SomaDoisNumeros");
        System.out.println("Começando SubtraiDoisNumeros");
        calculadora.SubtraiDoisNumeros();
    }
}
