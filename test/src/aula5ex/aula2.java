package aula5ex;
public class aula2 {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.abrirConta("corrente");
        c1.setNumConta(111);
        c1.setDono("Anderson");
        c1.depositar(20);
        c1.pagarMensal();
        c1.verificar();

        Conta c2 = new Conta();
        c2.abrirConta("poupança");
        c2.setNumConta(222);
        c2.setDono("julia");
        c2.sacar(140);
        c2.pagarMensal();
        c2.verificar();
        c2.fecharConta();
        
}
}
