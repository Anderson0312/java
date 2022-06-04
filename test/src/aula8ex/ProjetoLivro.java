package aula8ex;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        p[0] = new Pessoa("pedro", 22, "M");
        p[1] = new Pessoa("Maria", 24,"F");

        l[0] = new Livro("Aprendendo Java", "Jose da silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 340, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 310, p[0]);

        l[0].abrir();
        l[0].folhaere(350);
        l[0].getPagAtual();
        System.out.println(l[0].detalhes());
    }
}
