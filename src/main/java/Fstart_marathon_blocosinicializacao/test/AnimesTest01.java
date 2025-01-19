package Fstart_marathon_blocosinicializacao.test;

import Fstart_marathon_blocosinicializacao.domain.Anime;

public class AnimesTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("atkontitan", "Terror");
        
        for(int episodio : anime.getEpisodios()){
            System.out.println(episodio + " ");
        }

        // anime.setNome("atkontitan");
        // anime.setTipo("Terror");

        // anime.imprime();
        

    }
}
