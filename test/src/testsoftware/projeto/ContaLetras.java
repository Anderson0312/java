package testsoftware.projeto;

public class ContaLetras {
    public int contadorp (String palavra) 
    {
        int count = 0;
        for (int i = 0; i <palavra.length(); i++) 
        {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A')
            count++;
        }
        return count;
    }
}