package aula6;
public class aula6 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.ligarMudo();

        c.abrirMenus();
        c.fecharMenu();

    }
}