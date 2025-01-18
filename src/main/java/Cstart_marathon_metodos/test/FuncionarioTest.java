package Cstart_marathon_metodos.test;

import Cstart_marathon_metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("estevao");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1348, 922.32, 1500});

        funcionario.imprimirfuncionario();
        System.out.println("Media: " + funcionario.getMedia());

    }
}
