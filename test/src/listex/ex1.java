package listex;

import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de Pessoa que deseja:");
        int n = sc.nextInt();
        System.out.println("----------------------------------");

        double[] altura = new double[n];
        double sum = 0.0;
        for (int i=0; i<n; i++) {
            System.out.println("Defina a altura da " +(i +1 )+ " pessoa: ");
            altura[i] = sc.nextDouble();   
            sum += altura[i];
        }

        System.out.println("----------------------------------");
        double media = sum / altura.length;
        System.out.println("á média é de altura é "+ media);
        sc.close();
    }
}


// 