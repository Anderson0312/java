package aula9;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;


    public void cancelarMatr() {
        System.out.println("Matrica será cancelada!");
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
}
