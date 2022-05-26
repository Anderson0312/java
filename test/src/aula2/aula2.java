package aula2;
public class aula2 {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.destampar();
        
        c1.status();
        c1.rabiscar();


        caneta c2 = new caneta();
        c2.modelo = "bic";
        c2.cor = "preta";
        c2.ponta = 0.6f;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}
