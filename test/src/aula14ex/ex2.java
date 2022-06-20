package aula14ex;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de dados que deseja:");

        int n = sc.nextInt();
        System.out.println("----------------------------------");

        double[][] Produto = new double[n][2];

        for (int i=0; i<n; i++) {
            System.out.println("Primeiro PRODUTO:" + (i+1));
            for (int j=0; j<2; j++) {

                Produto[i][1] = sc.nextInt();  
				 
                // System.out.print(Produto[i][i] + " ");
			}
            System.out.println("\n");    
            
        }

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += Produto[i][2];
        }

        double media = sum / Produto.length;
        System.out.println("A média de produtos "+ media);
    }

}
