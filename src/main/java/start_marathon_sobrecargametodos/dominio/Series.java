package start_marathon_sobrecargametodos.dominio;

public class Series {
    private String tipo;
    private int episodios;

    public void imprime(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
