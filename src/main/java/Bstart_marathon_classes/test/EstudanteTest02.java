package Bstart_marathon_classes.test;

import Bstart_marathon_classes.dominio.Estudante;

import java.sql.SQLOutput;

public class EstudanteTest02 {
    public static void main (String[] args){
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Sei sim";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("------------------------------------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
