package aula5ex;
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public Conta() {
        this.setSaldo(0.0f);
        this.setStatus(false);
    }


    
    public Integer getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }


    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }


    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean isStatus() {
        return status;
    }

    
    public void abrirConta(String tipo) {     
        this.setTipo(tipo);  
        if(getTipo() == "corrente") {
            this.setSaldo(50);
        } else if(getTipo() == "poupança") {
            this.setSaldo(150);
        } 
        this.setStatus(true);
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta() {
        if (this.getSaldo() < 0) {
            System.out.println("Sua conta possui debito, page os debitos para fechar a conta!");
        } else if(getSaldo() > 0) {
            System.out.println("Sua conta ainda possui um dinheiro retire para fechar a conta!");
        }  else  {
            System.out.println("Sua conta foi fechada com SUCESSO!");
            this.setStatus(false);
        }
    }
    public void depositar(float depositar){
        
        if(this.isStatus() == true){
            this.setSaldo(this.getSaldo() + depositar);
        } else {
            System.out.println("Não é possivel depositar em uma conta que não existe.");
        }
    }
    public void sacar(float sacar){
        if(this.isStatus()) {
            if(this.getSaldo() >= sacar) {
                this.setSaldo(this.getSaldo() - sacar);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        }  else {
            System.out.println("Sua conta não possui Valor suficiente ou não existe!");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if(this.getTipo() == "corrente") {
            v = 12;
        } else if(this.getTipo() == "poupança") {
            v = 20;
        }
        if (this.isStatus() == true) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());

        } else {
            System.out.println("Conta invalida");
        }
    }

    public void verificar() {
        System.out.println("-----------------------------------");
        System.out.println("Sobre a Sua CONTA: ");
        System.out.println("Numero: " + this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("-----------------------------------");
    }


}
