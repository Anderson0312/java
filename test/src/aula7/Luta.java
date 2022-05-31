package aula7;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador L1, Lutador L2){
        if (L1.getCategoria() == L2.getCategoria() && L1 != L2) {
            this.aprovada = true;
            this.desafiante = L2;
            this.desafiado = L1;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void Lutar(){
        if(this.aprovada) {
            System.out.println("=-==-==-==-=DESAFIADO=-==-==-==-=");
            this.desafiado.apresentar();
            System.out.println("=-==-==-==-=DESAFIANTE=-==-==-==-=");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2 
            System.out.println("==============RESULTADO==============");
            switch (vencedor) {
                case 0: // empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // deafiado vence
                    System.out.println("Vitoria do " + this.desafiado.getName());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("Vitoria do " + this.desafiante.getName());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer!");
        }
        System.out.println("=======================================");
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    
}
