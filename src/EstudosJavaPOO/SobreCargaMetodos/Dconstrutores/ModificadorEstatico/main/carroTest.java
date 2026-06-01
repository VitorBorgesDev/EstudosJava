package EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.ModificadorEstatico.main;

import EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.ModificadorEstatico.Dominio.carro;

public class carroTest {
    public static void main(String[] args) {
        carro carro1 = new carro("BMW", 280);
        carro carro2 = new carro("Mercedes", 310);
        carro carro3 = new carro("Audi", 290);


        carro.setVelocidadeLimite(180);


        carro1.imprime();
        carro1.imprime();
        carro3.imprime();







    }





}
