package javaCore.SobreCargaMetodos.Dconstrutores.Gassociaçao.main;

import javaCore.SobreCargaMetodos.Dconstrutores.Gassociaçao.dominio.Time;
import javaCore.SobreCargaMetodos.Dconstrutores.Gassociaçao.dominio.jogador;

public class jogadorTest02 {
    public static void main(String[] args) {

        jogador jogador1 = new jogador("Pelé");

        Time time = new Time("Seleção brasileira");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
