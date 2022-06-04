package aula10;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;


    public void pagarMensal() {
        System.out.println("Mensal paga pelo aluno " + this.getName());
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
