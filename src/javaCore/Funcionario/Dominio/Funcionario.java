package javaCore.Funcionario.Dominio;

public class Funcionario {
   private String nome;
   private int idade;
   private double[] salarios;



    public void ExibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade " + this.idade);
        System.out.println("Salario " + this.salarios);
        for (double salario: salarios) {
            System.out.println(salario + " ");
        }


    }


    public void ImprimeMediaSalarios(){
        double media = 0;
        for (double salario: salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media final: " + media);
    }


    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }
}
