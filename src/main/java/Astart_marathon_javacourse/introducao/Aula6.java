package Astart_marathon_javacourse.introducao;

public class Aula6 {
    public static void main(String[] args) {
        int count = 0;
        while(count < 10){
            System.out.println(count++);
        }
        count = 0;
        do {
            System.out.println("Dentro do while" + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++){
            System.out.println("for" + i);
        }
    }
}
