package javaCore.SobreCargaMetodos.Dconstrutores.Gassociaçao.main;

import javaCore.SobreCargaMetodos.Dconstrutores.Gassociaçao.dominio.jogador;

public class jogadorTest {
    public static void main(String[] args) {
        jogador jogador1 = new jogador("Pele");
        jogador jogador2 = new jogador("Romario");
        jogador jogador3 = new jogador("Cafu");


        jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
