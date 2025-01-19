package Fstart_marathon_blocosinicializacao.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

// 1- alocado espaço em memoria para o objeto
// cada atributo de classe é criado e inicializado com valoresdefault ou oq for passado
//  bloco deinicializaçãp é executado
// construtor é executado

    {
        System.out.println("bloco de inicialização");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }    
    }

    public Anime(){
        for(int episodio: this.episodios){
            System.out.println(episodio + " ");
        }
    }


    public Anime(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

//     public void imprime(){
//         System.out.println("nome: " + this.nome);
//         System.out.println("tipo: " + this.tipo);
//     }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int[] episodios){
        this.episodios = episodios;
    }
    public int[] getEpisodios(){
        return this.episodios;
    }
}
