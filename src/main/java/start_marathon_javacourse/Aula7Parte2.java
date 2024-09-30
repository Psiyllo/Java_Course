package start_marathon_javacourse;

public class Aula7Parte2 {
    public static void main(String[] args) {
        // para testar
        // byte, short, int, long, float, double 0;
        // char '\u0000' ' ';
        // boolean false
        // String null

//        boolean [] idades = new boolean[3];
//        System.out.println(idades[0]);
//        System.out.println(idades[1]);
//        System.out.println(idades[2]);

//        String[] nomes = new String[3];
//        nomes[0] = "Tudo";
//        nomes[1] = "Nada";
//        nomes[2] = "Simples";
//        for (int i = 0; i < 3; i++) {
//            System.out.println(nomes[i]);
//        }

        String[] Nomes = new String[6];
        Nomes[0] = "Tudo";
        Nomes[1] = "Nada";
        Nomes[2] = "Simples";
        Nomes[3] = "Já Sabe";
//        Nomes[4] = "Tirareis";
//        Nomes[5] = "KLLKKLLKKL";
        for (int i = 0; i < Nomes.length; i++) {
            System.out.println(Nomes[i]);
        }
    }
}
