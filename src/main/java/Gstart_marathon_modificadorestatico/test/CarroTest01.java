package Gstart_marathon_modificadorestatico.test;

import Gstart_marathon_modificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porsche", 260);
        Carro carro2 = new Carro("Bmw", 290);
        Carro carro3 = new Carro("Bulgatti", 340);

        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 180;
        System.out.println(Carro.velocidadeLimite);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
