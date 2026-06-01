package EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.domain;

public class Anime {
    private String nome;
   private String tipo;
   private int episodios;
   private String genero;
   private String estudio;

   public Anime(String nome, String tipo, int episodios, String genero) {
       this();
       this.nome = nome;
       this.tipo = tipo;
       this.episodios = episodios;
       this.genero = genero;

   }

    public Anime(String nome, String tipo, int episodios, String genero,  String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }



    public Anime(){
       System.out.println("Dentro do construtor sem atributos ");
   }


    public void imprimirAnime() {
       System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Episodios: " + episodios);
        System.out.println("Genero: " + genero);

    }
}
