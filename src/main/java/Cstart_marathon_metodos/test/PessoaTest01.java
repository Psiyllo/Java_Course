package Cstart_marathon_metodos.test;

import Cstart_marathon_metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("fernandinho beiramar");
        pessoa.setIdade(20);
        pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
