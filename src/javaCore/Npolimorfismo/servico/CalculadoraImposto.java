package javaCore.Npolimorfismo.servico;

import javaCore.Npolimorfismo.dominio.Computador;
import javaCore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularTaxa();
        System.out.println("Imposto do computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do computador");
        double imposto = tomate.calcularTaxa();
        System.out.println("Imposto do computador " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

}
