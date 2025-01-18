package Astart_marathon_javacourse.introducao;

public class Aula6parte4 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++ ) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela+ " R$ " + valorParcela); //esta fora do if, dentro do for
        }
    }
}
