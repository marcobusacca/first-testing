package com.advancia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class ProvaTest {
	
	@BeforeAll
    public static void setup() {
        // eseguito una volta
        // prima di tutti i metodi di test
    }
    
    @BeforeEach
    public void init() {
        // eseguito prima di ogni metodo di test
    }
    
    @AfterEach
    public void clear() {
        // eseguito dopo ogni metodo di test
    }
    
    @AfterAll
    public static void cleanup() {
        // eseguito una volta
        // dopo di tutti i metodi di test
    }

//	@Test
//	@DisplayName("verifica somma")
//	void testSomma() {
//		Prova p = new Prova();
//		int num1 = 2;
//		int num2 = 2;
//		int sum = num1 + num2;
//		assertEquals(sum, p.somma(num1, num2));
//	}
	
	@RepeatedTest(5)
	void testSomma() {
		Prova p = new Prova();
		int num1 = 2;
		int num2 = 2;
		int sum = num1 + num2;
		assertEquals(sum, p.somma(num1, num2));
	}

}
