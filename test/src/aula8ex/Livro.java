package aula8ex;

public class Livro implements Publicacao{
    private  String titulo;
    private  String autor;
    private  int totPaginas;
    private  int pagAtual;
    private  boolean aberto;
    private  Pessoa leitor;


    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public  int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {

        this.pagAtual = pagAtual;
    }

    public  String getTitulo() {
        return titulo;
    }
    public  void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public  Pessoa getLeitor() {
        return leitor;
    }
    public  void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public  boolean isAberto() {
        return aberto;
    }
    public  void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public  int getTotPaginas() {
        return totPaginas;
    }
    public  void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public  String getAutor() {
        return autor;
    }
    public  void setAutor(String autor) {
        this.autor = autor;
    }


    public String detalhes() {
        return "Livro" + "Titulo = " + titulo + "\n, autor = " + autor + "\n, total de paginas = " + totPaginas + "\n, aberto = " + aberto + "\n, leitor = " + leitor.getName() + "\n, idade = " + leitor.getIdade() + "\n, sexo = " + leitor.getSexo() + "";
    }


    @Override
    public void abrir() {
        this.aberto = true;
        
    }

    @Override
    public void fechar() {
        this.aberto = false;
        
    }

    @Override
    public void folhaere(int p) {
        if(p > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }  
    }

    @Override
    public void avançarPage() {
        this.pagAtual++;
        
    }

    @Override
    public void voltarPage() {
        this.pagAtual--;
        
    }

}