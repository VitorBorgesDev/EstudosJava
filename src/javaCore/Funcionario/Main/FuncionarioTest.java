package javaCore.Funcionario.Main;

import javaCore.Funcionario.Dominio.Funcionario;

public class FuncionarioTest {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("vitor");
        funcionario.setSalarios(new  double[]{100.0, 200.0, 300.0});
        funcionario.setIdade(0);
        funcionario.ExibirDados();
        funcionario.ImprimeMediaSalarios();



    }




}
