package aula11;

public class Ave extends Animal{
    private String corPena;

    public void fazerNinho() {
        System.out.println("Criando Ninho");
    };

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Futras");
        
    }

    @Override
    public void emitirSim() {
        System.out.println("Som de Ave");
        
    }
    
}
