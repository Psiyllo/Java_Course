package start_marathon_javacourse.introducao;

public class Aula5Parte6 {

    public static void main(String[] args) {
        byte dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}