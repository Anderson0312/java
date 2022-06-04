package aula11;

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha() {
        System.out.println("Som de uma bolha");
    };

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
        
    }

    @Override
    public void emitirSim() {
        System.out.println("Som de Peixe");
        
    }
}
