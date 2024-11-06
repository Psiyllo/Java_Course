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
}
