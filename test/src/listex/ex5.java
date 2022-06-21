package listex;
import java.util.Random;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

        Random gerador = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = gerador.nextInt(10);  
                System.out.print(mat[i][i] + " ");
			}
            System.out.println("\n");
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
            
		}
		
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
        System.out.println("\n");
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();
	}
}