package start_marathon_metodos.dominio;

public class Calculadora {
    public void SomaDoisNumeros(){
        System.out.println(10+10);
    }
    public void SubtraiDoisNumeros(){
        System.out.println(20-14);
    }

    public int  MultiplicaDoisNumeros(int num1, int num2){
        return num1 * num2;
    }

    public double DivideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public void somaArray(int[] nums){
        int soma =0;
        for (int num : nums) {
            soma += num;
        }
        System.out.println(soma);
    }

    //se tiver mais de um atributo o int... tem que necessariamente ser o ultimo
    public void somaVarArgs(int... nums){
        int soma =0;
        for (int num : nums) {
            soma += num;
        }
        System.out.println(soma);
    }

}
