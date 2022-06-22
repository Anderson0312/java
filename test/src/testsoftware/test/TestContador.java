package testsoftware.test;

import static org.junit.Assert.*;
import org.junit.Test;

import testsoftware.projeto.ContaLetras;

public class TestContador {

    @Test
    public void test() {
        ContaLetras test= new ContaLetras();
        int saida = test.contadorp("MuitoBurroAnimal");
        assertEquals(2,saida);
    }    
}
