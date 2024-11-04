package start_marathon_javacourse.introducao;

public class Aula4 {
    public static void main(String[] args) {
        int numero01 = 40;
        int numero02 = 10;
        double resultado = numero01 / numero02;
        System.out.println(resultado);


        int resto = 21 % 8;
        System.out.println(resto);


        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        boolean isDezIgualDez = 10 == 10;
        System.out.println("dez é maior que vinte ? " + isDezMaiorQueVinte);
        System.out.println("dez é menor que vinte ? " + isDezMenorQueVinte);
        System.out.println("dez é igual a vinte ? " + isDezIgualVinte);
        System.out.println("dez é diferente de vinte ? " + isDezDiferenteVinte);
        System.out.println("dez é igual a dez ? " + isDezIgualDez);


        // && = AND
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("maior que trinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("menor que trinta " + isDentroDaLeiMenorQueTrinta);


        // || = OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPc = 5000F;
        boolean isPcCincoCompravel = valorTotalContaCorrente > valorPc || valorTotalContaPoupanca > valorPc;
        System.out.println("da pra comprar o pc ?" +isPcCincoCompravel);


        double bonus = 1800;
        bonus += 2800;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
