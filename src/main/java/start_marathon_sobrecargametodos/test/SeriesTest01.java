package start_marathon_sobrecargametodos.test;

import start_marathon_sobrecargametodos.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args) {
        Series series = new Series();

        series.setTipo("Terror");
        series.setEpisodios(24);

        series.imprime();

    }
}
