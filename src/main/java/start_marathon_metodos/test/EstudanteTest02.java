package start_marathon_metodos.test;

import start_marathon_metodos.dominio.Estudante;
import start_marathon_metodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Paulo";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Eduarda";
        estudante02.idade = 21;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
}
}
