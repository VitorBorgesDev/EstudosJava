package javaCore.AulaMaratonaJava.Java;

public class Aula06EstruturasDeRepetiçao04 {
    static void main(String[] args) {
        // dado o valor de um carro descubra quantas vezes ele pode ser parcelado
        // Condiçao ValorParcela >= 1000
            double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {

            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println( "parcela "+ parcela+ " R$ "+ valorParcela  );


            }

        }

    }

