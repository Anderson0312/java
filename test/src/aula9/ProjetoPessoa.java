package aula9;

public class ProjetoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();

        p1.setName("Anderson");
        p2.setName("Maria");
        p3.setName("Claudio");
        p4.setName("Fabiana");

        p1.setSexo("M");
        p2.setSexo("F");

        p3.setIdade(19);

        p2.setCurso("Informatica");
        p3.setSetor("Estoque");
        p4.setSalario(2500.23f);

        p4.receberAumento(550.23f);
        p3.mudarTrabalho();
        p2.cancelarMatr();
        

       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());

    }
}
