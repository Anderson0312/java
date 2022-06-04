package aula10;

public class Tecnico extends Aluno {
    private int registroProfissional;

    private void Praticar() {
        System.out.println("O aluno " + this.getName() + "Está praticando");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
