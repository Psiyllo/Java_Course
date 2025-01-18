package Astart_marathon_javacourse.introducao;

public class Aula5Parte2 {
    public static void main(String[] args) {
        int idade = 12;
        String categoria = null;

//        if(idade < 15){
//            categoria = "Categoria Infantil";
//        } else if(idade >= 15 && idade < 18){
//            categoria = "Categoria Juvenil";
//        } else if (idade > 18){
//            categoria = "Categoria Adulto";
//        }

        categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);
    }
}
