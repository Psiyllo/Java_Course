package Astart_marathon_javacourse.introducao;

public class Aula7Parte3{
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = {5,4,3,2,1};

//        for (int i = 0; i < numeros3.length; i++) {
//            System.out.println(numeros3[i]);
//        }
        for (int num : numeros2){
            System.out.println(num);
        }
    }
}