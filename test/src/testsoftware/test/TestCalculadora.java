package testsoftware.test;

import static org.junit.Assert.*;
import org.junit.Test; //import do junit

import testsoftware.projeto.Calculadora; 

public class TestCalculadora {

    // ----------------------TESTES DE NUMERO AO QUADRADOR----------------------------
    @Test
    public void quadrado1() {
        Calculadora test= new Calculadora();
        int saida = test.quadrado(2);
        assertEquals(4,saida);
    }    

    @Test
    public void quadrado2() {
        Calculadora test= new Calculadora();
        int saida = test.quadrado(0);
        assertEquals(0,saida);
    }

    @Test
    public void quadrado3() {
        Calculadora test= new Calculadora();
        int saida = test.quadrado(-3);
        assertEquals(9,saida);
    }

    
    //---------------------------- TESTES DE SOMA ----------------------------
    @Test 
    public void soma1() {
        Calculadora test= new Calculadora();
        int saida = test.soma(1, 2);
        assertEquals(3,saida);
    }

    @Test 
    public void soma2() {
        Calculadora test= new Calculadora();
        int saida = test.soma(0, 0);
        assertEquals(0,saida);
    }

    @Test 
    public void soma3() {
        Calculadora test= new Calculadora();
        int saida = test.soma(-1, -2);
        assertEquals(-3,saida);
    }
    @Test 
    public void soma4() {
        Calculadora test= new Calculadora();
        int saida = test.soma(-1, 2);
        assertEquals(1,saida);
    }

    @Test 
    public void soma5() {
        Calculadora test= new Calculadora();
        int saida = test.soma(2, 0);
        assertEquals(2,saida);
    }
    @Test 
    public void soma6() {
        Calculadora test= new Calculadora();
        int saida = test.soma(0, 2);
        assertEquals(2,saida);
    }

    //---------------------------- TESTES DE SUBTRAÇÃO ----------------------------
    @Test 
    public void subtração1() {
        Calculadora test= new Calculadora();
        int saida = test.subtração(2, 1);
        assertEquals(1,saida);
    }

    @Test 
    public void subtração2() {
        Calculadora test= new Calculadora();
        int saida = test.subtração(0, 0);
        assertEquals(0,saida);
    }
    @Test 
    public void subtração3() {
        Calculadora test= new Calculadora();
        int saida = test.subtração(-1, -2);
        assertEquals(1,saida);
    }

    @Test 
    public void subtração4() {
        Calculadora test= new Calculadora();
        int saida = test.subtração(-1, 2);
        assertEquals(-3,saida);
    }

    @Test 
    public void subtração5() {
        Calculadora test= new Calculadora();
        int saida = test.subtração(-1, 0);
        assertEquals(-1,saida);
    }

    @Test 
    public void subtração6() {
        Calculadora test= new Calculadora();
        int saida = test.subtração(2, 0);
        assertEquals(2,saida);
    }

    @Test 
    public void subtração7() {
        Calculadora test= new Calculadora();
        int saida = test.subtração(0, 2);
        assertEquals(-2,saida);
    }

    //---------------------------- TESTES DE DIVISÃO ----------------------------
    @Test 
    public void divide1() {
        Calculadora test= new Calculadora();
        int saida = test.divide(6, 2);
        assertEquals(3,saida);
    }

    @Test 
    public void divide2() {
        Calculadora test= new Calculadora();
        int saida = test.divide(-6, 2);
        assertEquals(-3,saida);
    }

    @Test 
    public void divide3() {
        Calculadora test= new Calculadora();
        int saida = test.divide(-6, -2);
        assertEquals(3,saida);
    }

    @Test 
    public void divide4() {
        Calculadora test= new Calculadora();
        int saida = test.divide(0, 6);
        assertEquals(0,saida);
    }

    @Test 
    public void divide5() {
        Calculadora test= new Calculadora();
        int saida = test.divide(6, 0);
        assertEquals(0,saida);
    }

    @Test 
    public void divide6() {
        Calculadora test= new Calculadora();
        int saida = test.divide(0, 0);
        assertEquals(0,saida);
    }



    // ---------------------------- TESTES DE MULTIPLICAÇÃO ----------------------------
    @Test 
    public void multiplicação1() {
        Calculadora test= new Calculadora();
        int saida = test.multiplicação(6, 2);
        assertEquals(12,saida);
    }

    
    @Test 
    public void multiplicação2() {
        Calculadora test= new Calculadora();
        int saida = test.multiplicação(-6, 1);
        assertEquals(-6,saida);
    }

    @Test 
    public void multiplicação3() {
        Calculadora test= new Calculadora();
        int saida = test.multiplicação(6, -2);
        assertEquals(-12,saida);
    }

    @Test 
    public void multiplicação4() {
        Calculadora test= new Calculadora();
        int saida = test.multiplicação(-6, -2);
        assertEquals(12,saida);
    }

    @Test 
    public void multiplicação5() {
        Calculadora test= new Calculadora();
        int saida = test.multiplicação(-6, 0);
        assertEquals(0,saida);
    }
    @Test 
    public void multiplicação6() {
        Calculadora test= new Calculadora();
        int saida = test.multiplicação(0, 0);
        assertEquals(0,saida);
    }

    @Test 
    public void multiplicação7() {
        Calculadora test= new Calculadora();
        int saida = test.multiplicação(2, 0);
        assertEquals(0,saida);
    }


    //----------------------------  TEST COM NUMEROS QUEBRADOS  ----------------------------
    @Test
    public void quadradoQuebrado() {
        Calculadora test= new Calculadora();
        int saida = test.quadrado(2.1);
        assertEquals(4.41,saida);
    } 

    @Test 
    public void somaQuebrado() {
        Calculadora test= new Calculadora();
        int saida = test.soma(1, 2.2);
        assertEquals(3.2,saida);
    }

    @Test 
    public void subtraçãoQuebrado() {
        Calculadora test= new Calculadora();
        int saida = test.subtração(2, 1.2);
        assertEquals(0.8,saida);
    }

    @Test 
    public void divideQuebrado() {
        Calculadora test= new Calculadora();
        int saida = test.divide(6.2, 2);
        assertEquals(3.1,saida);
    }

    public void multiplicaçãoQuebrado() {
        Calculadora test= new Calculadora();
        int saida = test.multiplicação(2, 2.2);
        assertEquals(4.4,saida);
    }
}
