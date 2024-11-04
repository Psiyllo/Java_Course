package start_marathon_javacourse.introducao;

public class Aula5Parte3 {
    public static void main(String[] args){
        double salario = 600;
        String mensagemDoar = "500 pra mim e é isso.";
        String mensagemNaoDoar = "Não vai da não.";

        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);

        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "500 pra mim e é isso." : "Não vai da não.";
        System.out.println(resultado);
    }
}
