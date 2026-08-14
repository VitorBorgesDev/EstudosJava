package javaCore.Kenum.Test;

import javaCore.Kenum.dominio.Cliente;
import javaCore.Kenum.dominio.TipoCliente;
import javaCore.Kenum.dominio.Cliente.TipoPagamento;

public class ClienteTest {
    static void main(String[] args) {
        Cliente cliente = new Cliente("Vitor", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente1 = new Cliente("Vitor", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(cliente);
        System.out.println(cliente1);

    }


}
