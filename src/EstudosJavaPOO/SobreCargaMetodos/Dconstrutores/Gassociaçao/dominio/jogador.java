package EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Gassociaçao.dominio;

public class jogador {
    private Time time;
    private String nome;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        if (time != null){
            System.out.println("Time: " + time.getNome());
        }

    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
