package listex.ex3;
public class Estudantes {
        public String Nome ;
        public String Email ;
        public int Quarto ;

        public Estudantes(String nome, String email)
        {
            Nome = nome;
            Email = email;
        }

        
        public String ToString()
        {
            return Nome + ", " + Email;
        }



    }
