package EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Hherença.Test;

import EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Hherença.Dominio.Endereco;
import EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Hherença.Dominio.Funcionario;
import EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Hherença.Dominio.Pessoa;

public class HerencaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("1288-189");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pessoa");
        pessoa.setCpf("23282030392");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Vitor");
        funcionario.setNome("vitor");
        funcionario.setCpf("1928123124");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(22.200);
        funcionario.imprime();





    }

}
