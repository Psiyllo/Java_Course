package start_marathon_metodos.dominio;

public class ImpressoraEstudante {
    public void imprimirEstudante(Estudante estudante) {

        System.out.println("---------------------------------------");

//        Qualquer alteração dentro do metodo obviamente vai trocar o retorno no objeto
//        estudante.nome = "Einstein";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        //com a alteração após os sout a primeira impressão saíra normal com o nome dos objetos que foi setado na classe, porém na segunda interação os nomes serão trocados para Einsten.
        //é simples, deu sout  com o objeto já existente após isso os nomes são trocados, portanto na segunda interação será impresso os nomes dos objetos pós alteração
        estudante.nome = "Einstein";

    }
}
