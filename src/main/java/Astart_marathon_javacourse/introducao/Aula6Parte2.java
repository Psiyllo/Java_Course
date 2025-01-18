package Astart_marathon_javacourse.introducao;

public class Aula6Parte2 {
    public static void main(String[] args) {
        //imprima apenas os pares de 0 a 100000
        for (int i = 0; i <= 100000; i+=2) {
            System.out.println(i);
        }
        //impares
        for (int i = 1; i <= 100000; i+=2) {
            System.out.println(i);
        }
        //par de outra maneira
        for (int i = 0; i <= 100000; i++) {
            if (i % 2 == 0)
            System.out.println(i);
        }
    }
}
