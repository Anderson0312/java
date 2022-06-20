package aula14ex.ex3;

import java.util.Scanner;


public class VetorClasse {
    public static void main(String[] args) {
            Estudantes[] vect = new Estudantes[10];
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantos quartos serão alugados? ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++)
            {
                
                System.out.println("Aluguel :" + i);
                System.out.println("Nome: ");
                String nome = sc.next();
                System.out.println("Email: ");
                String email = sc.next();
                System.out.println("Quarto: ");
                int quarto = sc.nextInt();
                vect[quarto] = new Estudantes(nome, email);
            }
            System.out.println();
            System.out.println("Quartos ocupados:");
            for (int i = 0; i < 10; i++)
            {
                if (vect[i] != null)
                {
                    System.out.println(i + ": " + vect[i]);
                }
            }


        }
    }

