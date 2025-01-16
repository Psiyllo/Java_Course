package start_marathon_metodos.test;

import start_marathon_metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "estevao";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{1348, 922.32, 1500};

        funcionario.imprimirfuncionario();

    }
}
