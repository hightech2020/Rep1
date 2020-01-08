package org.ht.TPMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Mon Test")
class ImpUtilTest {
	
	static ImpUtil iu = new ImpUtil();
	static int cpt=0;
	

	
	@BeforeAll
	@DisplayName("Test class ImpUtil")
	public static void classTest() {
		assertEquals("class org.ht.TPMaven.ImpUtil", iu.getClass().toString());
		System.out.println("Class OK !");
	}
	
	@Test
	@DisplayName("Test de produit")
	void testProd() {
		//fail("Not yet implemented");
		assertEquals(8,iu.prod(4,2));
	}

	@Test
	@DisplayName("Test de division")
	void testDiv() {
		//fail("Not yet implemented");
	}

	@Test
	@DisplayName("Test d'addition")
	void testAdd() {
		//fail("Not yet implemented");
		assertEquals(10,iu.add(7,3));
	}

	@Test
	@DisplayName("Test de soustraction")
	void testSoustr() {
		//fail("Not yet implemented");
		assertEquals(19,iu.soustr(23,4));
	}

	@Test
	@DisplayName("Test de PGCD")
	void testPGCD() {
		//fail("Not yet implemented");
		assertEquals(15,iu.PGCD(15, 45));
	}

	@Test
	@DisplayName("Test de factoriel")
	void testFact() {
		//fail("Not yet implemented");
		assertEquals(120,iu.Fact(5));
	}

	@Test
	@DisplayName("Test de nombre binaire")
	void testBin() {
		//fail("Not yet implemented");
		assertEquals("1111",iu.bin(15));
	}
    
	/*
	@Test
	@ParameterizedTest
	@ValueSource(ints = {15,26,250})
	@DisplayName("Test de paraite")
	void testEstPair(int arg) {
		//fail("Not yet implemented");
		assertTrue(iu.estPair(arg),"Not Pair");
	}*/
	
	@RepeatedTest(10)
	@DisplayName("Repeat")
	void repeatedTest() {
		assertEquals(6, iu.incrementInt(), "not equal");
		
	}
	
	@AfterEach
	public void incrCount() {
		cpt++;
	}
	
	@AfterAll
	public static void AfficherCount() {
		System.out.println("Count tests : " +cpt);
	}
	
	
	
	@Test
	public void testIsPalindrome() {
		String input = "laval";
		assertEquals(true, iu.isPalindrome(input));
	}
	
}
