package aula5ex;
import java.util.Scanner;
public class aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-= ");
        System.out.println("-=-=-==-==-SEJA BEM VINDO AO BANCOSENAC=-=-=-=-=-=-=-=-=- ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-= ");
        System.out.println("Digite o tipo da conta: ");
        System.out.println("Tipos disponiveis [corrente] ou [poupança]: ");
        String tipo = sc.next();
        System.out.println("Digite o Numero da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Digite o Nome do Dono da conta: ");
        String nomeDono = sc.next();
        System.out.println("Digite o Deposito da conta: ");
        float deposito = sc.nextFloat();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-==-=-==-=-==-=-");

        Conta c1 = new Conta();
        c1.abrirConta(tipo);
        c1.setNumConta(numConta);
        c1.setDono(nomeDono);
        c1.depositar(deposito);
        c1.verificar();

        while (true) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=- ");
        System.out.println("Deseja fazer um saque ([1] para SIM)/([2] para NAO) ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=- ");
        int sacaroun = sc.nextInt();
            if (sacaroun == 1) {
                System.out.println("Digite o Valor que deseja sacar: Seu Saldo é [" + c1.getSaldo()+"]");
                float sacar = sc.nextFloat();
                c1.sacar(sacar);
                c1.verificar();
                sc.close();
                break;
            } else if(sacaroun == 2) {
                System.out.println("Ok você não deseja sacar!");
                break;
            } else {
                System.out.println("Só é aceito ([1]SIM) ou ([2]NAO)");
            }
        }      
}
}
