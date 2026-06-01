package EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.BlocosInicializaçao.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 1 - alocado um espaco de memoria pro objeto
    // 2 - cada atributo de classe e criado e inicializado com valores default ou o quer for passado
    // 3 - bloco de inicializacao e executado
    // 4 - construtor e executado





    {

        System.out.println("inicializando anime");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }



        for (int episodios : Anime.episodios) {
            System.out.print(episodios + " ");

        }

        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
