package aula14ex;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de dados que deseja:");

        int n = sc.nextInt();
        System.out.println("----------------------------------");

        double[] Produto = new double[n];
        for (int i=0; i<Produto.length; i++) {
            System.out.println("Primeiro PRODUTO:");
            // Produto[i] = sc.next();
            Produto[i] = sc.nextDouble();
            Produto[i] = sc.next();
        }

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += Produto[i];
        }

        double media = sum / Produto.length;
        System.out.println("A média de produtos "+ media);
    }

}
