package start_marathon_javacourse.introducao;

public class Aula8 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[0][2] = 29;
        dias[1][0] = 75;
        dias[1][1] = 74;
        dias[1][2] = 73;
        dias[2][0] = 3;
        dias[2][1] = 2;
        dias[2][2] = 1;
//        System.out.println(dias[0][1]);
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
                
            }
        }
        System.out.println("-------------------------------------------------------------------------");
        for(int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
