package javaCore.Npolimorfismo.Test;

import javaCore.Npolimorfismo.dominio.Computador;
import javaCore.Npolimorfismo.dominio.Tomate;
import javaCore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Computador computador = new Computador("Ryzen 7 5700x", 1100);
        Tomate tomate = new Tomate("tomate italiano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);


    }
}
