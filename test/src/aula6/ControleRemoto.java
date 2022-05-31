package aula6;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }


    private boolean isTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    private boolean isLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void abrirMenus() {
        System.out.println("Sua tv está " + this.isLigado()); 
        System.out.println("Esta tocando? " + this.isTocando());
        System.out.println("O volume da tv é: " + this.getVolume());
        for (int i = 0; i <= getVolume(); i+=10 ){
            System.out.print("|");
        }
        System.out.println("");
    }

    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() + 5);
        }
    }

    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() - 5);
        }
    }

    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    public void desligarMudo() {
        if (this.isLigado() && getVolume() == 0) {
            this.setVolume(50);
        }
    }

    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
        
    }
}
