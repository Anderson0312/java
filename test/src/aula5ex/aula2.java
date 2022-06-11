package aula5ex;
import java.util.Scanner;
public class aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo da conta: ");
        String tipo = sc.next();
        System.out.println("Digite o Numero da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Digite o Nome do Dono da conta: ");
        String nomeDono = sc.next();
        System.out.println("Digite o Deposito da conta: ");
        float deposito = sc.nextFloat();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ");

        Conta c1 = new Conta();
        c1.abrirConta(tipo);
        c1.setNumConta(numConta);
        c1.setDono(nomeDono);
        c1.depositar(deposito);
        c1.verificar();


}
}
