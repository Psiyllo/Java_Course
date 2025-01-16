package start_marathon_metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprimirfuncionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios != null) {
            for (double salario : this.salarios) {
                System.out.println("Salario: " + salario);
            }
        }
        mediasalario();
    }

    public void mediasalario(){
        if (salarios == null) {
            return;
        }
            for (double salario : this.salarios) {
                media += salario;
            }
            media /= this.salarios.length;
        System.out.println("Media Salarial: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
