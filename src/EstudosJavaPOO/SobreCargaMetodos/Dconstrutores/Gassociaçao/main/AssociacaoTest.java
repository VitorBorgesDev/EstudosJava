package EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Gassociaçao.main;

import EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Gassociaçao.dominio.Aluno;
import EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Gassociaçao.dominio.Local;
import EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Gassociaçao.dominio.Professor;
import EstudosJavaPOO.SobreCargaMetodos.Dconstrutores.Gassociaçao.dominio.Seminario;

public class AssociacaoTest {
    static void main(String[] args) {
        Local local = new Local("Rocinha");
        Aluno aluno = new Aluno("Vitor", 18);
        Professor professor = new Professor("Matématica", "Jorge");

        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Trabalho de artes", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();


    }
}
