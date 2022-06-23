package testsoftware.projeto;


public class Calculadora {

    public int quadrado(int n) {
        return n*n;
    }

    public int soma(int n ,int b) {
        return n+b;
    }

    public int subtração(int n, int b) {
        return n-b;
    }

    public int divide(int n, int b)
     {   
        if (b == 0) 
            return 0;
        else
            return n/b;
    }

    public int multiplicação(int n, int b) {
        return n*b;
    }
}
