package javaCore.AulaMaratonaJava.Java;

public class Aula04Operadores {
    static void main(String[] args) {
        int numero1 = 50;
        int numero2 = 29;
        int resultado = numero1 + numero2;

        System.out.println( "Valor " + resultado);

        //divisão

        double numero3 = 4;
        double numero4 = 2;
        double  resultado1 = numero3 / numero4;

        System.out.println( "Valor " + resultado1);


       // %
        int resto = 80 % 2;
        System.out.println( "Valor " + resto);



        // < > <= >= == != operadores logicos
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezIgualQueDez " + isDezIgualADez);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);

        // && (AND) // (ar) !
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isisDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        double ValorTotalContaCorrente = 1200;
        double ValorTotalContaPoupança = 10000;
        float ValorPlayCinco = 5000f;
        boolean IsPlayStationCompravel = ValorTotalContaCorrente > ValorPlayCinco || ValorTotalContaPoupança > ValorPlayCinco;

        System.out.println("IsPlayStationCompravel "+IsPlayStationCompravel);

        // = += -= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contado = 0;
        contado += 1;
        contado++;
        contado--;
        ++contado;
        --contado;
        int contador2 = 0;
        System.out.println(++contador2);







      }
}
