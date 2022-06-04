package aula10;

public class ProjetoPessoa {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setName("Anderson");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(22);
        a1.setSexo("M");
        a1.pagarMensal();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(222);
        b1.setName("Vinicius");
        b1.setBolsa(12.4f);
        b1.setSexo("M");
        b1.pagarMensal();


    }
}
