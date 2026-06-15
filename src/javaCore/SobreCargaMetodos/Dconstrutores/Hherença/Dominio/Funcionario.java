package javaCore.SobreCargaMetodos.Dconstrutores.Hherença.Dominio;

public class Funcionario extends Pessoa {

   private double salario;
    static {
        System.out.println("Dentro do bloco estático");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }


    public void  imprime(){
       super.imprime();
       System.out.println(this.salario);

   }

   public void relatorioPagamento(){
       System.out.println("Nome: " + this.nome + "recebi o salario de " + this.salario);
   }




   public double getSalario() {
       return salario;
   }

   public void setSalario(double salario) {
       this.salario = salario;


   }


}
