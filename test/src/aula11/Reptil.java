package aula11;

public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejadno");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
        
    }

    @Override
    public void emitirSim() {
       System.out.println("Som de Reptil");
        
    }
}
