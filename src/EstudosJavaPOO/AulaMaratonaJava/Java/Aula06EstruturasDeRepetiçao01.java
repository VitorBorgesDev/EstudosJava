package EstudosJavaPOO.AulaMaratonaJava.Java;

public class Aula06EstruturasDeRepetiçao01 {
    static void main(String[] args) {
        // while, do while, for
        int count = 0;


        while (count < 10 ){
            System.out.println(++count);


        }

        do {
            System.out.println("dento do do while");
        } while (count < 10);

        for(int i = 0; i <= 10; i++ ){
            System.out.println("for " + i);

        }


    }

}
