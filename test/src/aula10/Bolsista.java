package aula10;

public class Bolsista extends Aluno{
    private float bolsa;

    private void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getName());
    }

    @Override
    public void pagarMensal() {
        System.out.println(this.getName() + " Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
