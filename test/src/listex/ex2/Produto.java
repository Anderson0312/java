package listex.ex2;
public class Produto {
        private String Nome ;
        private double Preco ;   

        public Produto(String nome, double price)
        {
            Nome = nome;
            Preco = price;
        }

        public String getNome() {
            return Nome;
        }

        public void setNome(String nome) {
            this.Nome = nome;
        }

        public double getPreco() {
            return Preco;
        }

        public void setPreco(double preco) {
            this.Preco = preco;
        }
    }
