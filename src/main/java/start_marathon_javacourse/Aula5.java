package start_marathon_javacourse;

public class Aula5 {
    public static void main (String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida");
        } else {
            System.out.println("Não Autorizado comprar bebida");
        }
        boolean c = false;
        if (c == true) {
            System.out.println("já sabe né");
        }


        String categoria = null;
        
        if(idade < 15){
            categoria = "Categoria Infantil";
        } else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        } else if (idade > 18){
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
