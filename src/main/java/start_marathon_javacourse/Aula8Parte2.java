package start_marathon_javacourse;

public class Aula8Parte2 {
    public static void main(String[] args){

        int[] array = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = array;
        arrayInt[1] = new int[6];
        arrayInt[2] = new int[]{1,3,4,7,8,9,6,3,1};

        int[][] arrayInt2 = {{0,1,2},{4,5,2,4,5,3},{2,5,7,3,4,6,5,3,1}};

        for (int[] arrBase : arrayInt2){
            System.out.println("\n--------------");
            for (int num : arrBase){
                System.out.println(num);
            }
        }

    }
}
