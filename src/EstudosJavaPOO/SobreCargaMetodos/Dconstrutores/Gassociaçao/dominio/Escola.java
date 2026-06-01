package EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Gassociaçao.dominio;

public class Escola {
    private String nome;
    private Professor [] professores;


    public Escola(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("nome: " + this.nome);
        if(professores == null) return;
        for(Professor professor : professores){
            System.out.println(professor.getNome());
        }


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
