package Dstart_marathon_sobrecargametodos.dominio;

public class Serie {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //sobrecarga de metodo (da pra usar o mesmo metodo com quantidade de atriutos diferentess)

    public Serie (){
        
    }

    public void init (String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init (String nome, String tipo, int episodios,String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("nome: " + this.nome);
        System.out.println("tipo: " + this.tipo);
        System.out.println("episodios: " + this.episodios);
        System.out.println("genero: " + this.genero);
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public String getTipo(){
        return this.tipo;
    }
}