package javaCore.SobreCargaMetodos.Dconstrutores.Gassociaçao.main;

import java.util.Scanner;

public class LeituraDoTecladoTest {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Digite sua altura: ");
        float altura = leitor.nextFloat();

        System.out.println("Digite M ou F para o sexo");
        char sexo = leitor.next().charAt(0);

        System.out.println("-------------------------");
        System.out.println("nome: " + nome);
        System.out.println("altura: " + altura);
        System.out.println("idade: " + idade);
        System.out.println("sexo: " + sexo);











    }


}
