package javaCore.LClassesAbstratas.test;

import javaCore.LClassesAbstratas.dominio.Desenvolvedor;
import javaCore.LClassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    static void main(String[] args) {


        Gerente gerente = new Gerente("Pedro", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro", 5000);
        System.out.println(desenvolvedor);











    }


}
