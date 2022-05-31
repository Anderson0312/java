package aula7;


public class aula7 {
    public static void main(String[] args) {
        Lutador L[] = new Lutador[6];

        L[0] = new Lutador("Anderson", "França", 34, 1.80f, 68.9f, 12, 1, 3);

        L[1] = new Lutador("joão", "Brasil", 26, 1.70, 98.9, 9, 3, 2);

        L[2] = new Lutador("vinicius", "Estados unidos", 24, 1.75, 78.9, 8, 4, 1);

        L[3] = new Lutador("bruno", "Brasil", 36, 1.90, 88.9, 10, 3, 4);

        L[4] = new Lutador("junior", "Africa", 31, 1.72, 118.9, 11, 5, 1);

        L[5] = new Lutador("breno", "Europa", 30, 1.70, 65.9, 11, 5, 1);


        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L[4], L[3]);
        UEC01.Lutar();
        L[0].status();
        L[5].status();
    }
}