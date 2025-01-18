package Cstart_marathon_metodos.test;

import Cstart_marathon_metodos.dominio.Estudante;
import Cstart_marathon_metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Paulo";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Eduarda";
        estudante02.idade = 21;
        estudante02.sexo = 'F';

        impressora.imprimirEstudante(estudante01);
        impressora.imprimirEstudante(estudante02);

        System.out.println("#######################################");

//        impressora.imprimirEstudante(estudante01);
//        impressora.imprimirEstudante(estudante02);
    }
}
