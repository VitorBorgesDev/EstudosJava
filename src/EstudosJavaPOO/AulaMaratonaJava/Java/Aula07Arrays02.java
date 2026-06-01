package EstudosJavaPOO.AulaMaratonaJava.Java;

public class Aula07Arrays02 {
    static void main(String[] args) {
        // byte, short, int, long, float, double  0
        // char '/u000' ' '
        // boolean false
        // String null


        String[] nomes = new String[3];
         nomes [0] = "Goku";
         nomes [1] = "Maria";
         nomes [2] = "Douglas";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }
}
