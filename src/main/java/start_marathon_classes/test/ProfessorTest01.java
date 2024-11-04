package start_marathon_classes.test;

import start_marathon_classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args){
        Professor professor = new Professor();
        professor.nome = "Rivaldo";
        professor.idade = 52;
        professor.sexo = 'F';

        System.out.println("O professor se chama " + professor.nome + ", possui " + professor.idade + " anos, e é do sexo " + professor.sexo);
    }
}
