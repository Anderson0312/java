package testsoftware.test1;

public class ContaLetras {
    public void contadorp (String palavra) 
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