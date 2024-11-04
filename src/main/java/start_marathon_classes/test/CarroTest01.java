package start_marathon_classes.test;

import start_marathon_classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.nome = "Cara de mau";
        carro1.modelo = "Dodge Charger";
        carro1.ano = 1970;

        carro2.nome = "O mais pika de todos";
        carro2.modelo = "Palio Atractive";
        carro2.ano = 2013;

        carro3.nome = "só sei que nada sei";
        carro3.modelo = "kwid";
        carro3.ano = 2020;

//        Ta obvio oque vai acontecer aqui certo ?
//        carro1 = carro2;
//        carro2 = carro3;
//        carro3 = carro1;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("-------------------------------------------------------");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
        System.out.println("-------------------------------------------------------");
        System.out.println(carro3.nome);
        System.out.println(carro3.modelo);
        System.out.println(carro3.ano);
    }
}
