package start_marathon_metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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
        double media = 0;
            for (double salario : this.salarios) {
                media += salario;
            }
            media /= this.salarios.length;
        System.out.println("Media Salarial: " + media);
    }
}
