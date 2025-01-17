package start_marathon_sobrecargametodos.test;

import start_marathon_sobrecargametodos.dominio.Serie;

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
