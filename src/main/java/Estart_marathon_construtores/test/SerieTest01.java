package Estart_marathon_construtores.test;

import Estart_marathon_construtores.dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {
        
    
    Serie serie = new Serie();

    serie.init("SweetHome", "TV", 26, "Terror");
    
    // serie.setNome("Sweet Home");
    // serie.setTipo("Terror");
    // serie.setEpisodios(24);
    serie.imprime();

}
}
