package listex.ex2;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) { 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de dados que deseja:");

        int n = sc.nextInt();
        System.out.println("----------------------------------");

        Produto[] vect = new Produto[n];

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            System.out.println("Nome do Produto " + (i+1)+":");
            String name = sc.next();
            System.out.println("Preço do Produto: ");
            double price = sc.nextDouble();
            System.out.println("\n");   
             
            vect[i] = new Produto(name, price);
            sum += vect[i].getPreco();
        }


        double media = sum / n;
        System.out.printf("A média de produtos "+ media);
    }

}
