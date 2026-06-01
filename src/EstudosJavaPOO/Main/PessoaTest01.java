package EstudosJavaPOO.Main;

import EstudosJavaPOO.Dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pedro");
        pessoa.setIdade(23);


        pessoa.imprimir();

    }
}