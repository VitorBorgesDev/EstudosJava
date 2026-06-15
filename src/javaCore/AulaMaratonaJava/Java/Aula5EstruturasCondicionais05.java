package javaCore.AulaMaratonaJava.Java;

public class Aula5EstruturasCondicionais05 {
    static void main(String[] args) {
        byte dia = 5;


        // char, int, byte, short, String, enum
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("SEG");
                break;
            case 3:
                System.out.println("TER");
                break;
            case 4:
                System.out.println("QUA");
                break;
            case 5:
                System.out.println("QUI");
                break;
            case 6:
                System.out.println("SEX");
                break;
            case 7:
                System.out.println("SAB");
                break;

            default:
                System.out.println("Opção invalida");
                break;

                }

            char sexo = 'M';
                switch (sexo) {
                    case 'M':
                        System.out.println("Masculino");
                        break;

                    case 'F':
                        System.out.println("Feminino");
                        break;

                }

            }



        }


