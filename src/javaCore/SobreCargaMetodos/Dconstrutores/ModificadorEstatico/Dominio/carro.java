package javaCore.SobreCargaMetodos.Dconstrutores.ModificadorEstatico.Dominio;

public class carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeLimite = velocidadeLimite;
    }

    public void imprime() {
        System.out.println("-----------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade maxima " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + carro.velocidadeLimite);

    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        carro.velocidadeLimite = velocidadeLimite;

    }

    public static double getVelocidadeLimite() {
        return carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
