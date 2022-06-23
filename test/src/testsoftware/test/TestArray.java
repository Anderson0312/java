package testsoftware.test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/* @Autor Anderson Moura
 * Classe cria e testa o contéudo de um registro
 * prepara ambiente e finaliza ambiente após o teste
*/


public class TestArray {
	//cria registro com 6 inteiros
	private List<Integer> list;
	@Before
	public void setUp() {
		list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(5);
		list.add(9);
		
	}
	
	//limpa registro de inteiro apos o teste
	@After
	public void clearlist() {
		list.clear();
		System.out.println(list.toString());
	}

	@Test
	public void testDaLista() {
		list.remove(0); // Remove 1° elemento da lista.
		assertEquals(5, list.size()); //valida tamanho
		System.out.println(list);
	}
	    
	@Test
	public void OutroTest() {
		assertEquals(6, list.size());
		System.out.println(list);
	}

	@Test 
	public void AddItemLista() {
		list.add(1);
		assertEquals(7, list.size());
		System.out.println(list);
	}

}