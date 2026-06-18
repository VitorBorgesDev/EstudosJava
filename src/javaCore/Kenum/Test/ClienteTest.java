package javaCore.Kenum.Test;

import javaCore.Kenum.dominio.Cliente;
import javaCore.Kenum.dominio.TipoCliente;
import javaCore.Kenum.dominio.TipoPagamento;


public class ClienteTest {
    static void main(String[] args) {
        Cliente cliente = new Cliente("Vitor", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente1 = new Cliente("Vitor", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(cliente);
        System.out.println(cliente1);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.valueOf("pessoa Fisica");
        System.out.println(tipoCliente2);

    }


}
