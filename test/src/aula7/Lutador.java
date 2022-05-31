package aula7;

public class Lutador {
    private String name;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String name, String nacionalidade, int idade, double d, double e, int vitorias, int derrotas, int empates) {
        this.setName(name);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(d);
        this.setPeso(e);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(double d) {
        this.altura = (float) d;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(double e) {
        this.peso = (float) e;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        } else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if(this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
        
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getEmpates() {
        return empates;
    }


    public void apresentar() {
        System.out.println("=-==-==-==-==-==-==-==-==-==-==-=");
        System.out.println("Lutador: " + this.getName());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + "Anos");
        System.out.println(this.getAltura() + "M de Altura");
        System.out.println("PEsando " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("=-==-==-==-==-==-==-==-==-==-==-=");
    }

    public void status() {
        System.out.println("=-==-==-==-==-==-==-==-==-==-==-=");
        System.out.println(getName());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
        System.out.println("=-==-==-==-==-==-==-==-==-==-==-=");
    }

    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }
}
