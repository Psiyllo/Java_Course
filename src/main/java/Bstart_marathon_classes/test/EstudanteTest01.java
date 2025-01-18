package Bstart_marathon_classes.test;
import Bstart_marathon_classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        estudante.nome = "Paulo";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println("O nome do estudante em questão é: " + estudante.nome);
        System.out.println("Sua idade é: " + estudante.idade);
        System.out.println("E seu sexo é : " + estudante.sexo);
        System.out.println(estudante);
    }
}
