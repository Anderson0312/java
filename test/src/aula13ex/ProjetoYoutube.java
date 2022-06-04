package aula13ex;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] =new Gafanhoto[2];
        g[0] = new Gafanhoto("Anderson", 22 , "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "Creuza");

        Visualizacao vis[] = new Visualizacao[4];

        vis[0] = new Visualizacao(g[0], v[2]); // anderson assiste html
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[1]); // anderson assiste PHP
        vis[1].avaliar(87.0f);
        

        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        // System.out.println(v[2].toString());
        // System.out.println(g[1].toString());
    }
}
