package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberOperationTest {
	NumberOperations numoperation;
	
	@BeforeEach
	public void init() {
		numoperation=new NumberOperations();
	}

	@Test
	@DisplayName("primewithprime")
	void isPrimewithPrime() {
		boolean actual=numoperation.isprime(19);
		Assertions.assertEquals(actual, true);
	}
	
	@Test
	@DisplayName("primewithnumber")
	void isPrimewithNumber() {
		boolean actual=numoperation.isprime(-10);
		Assertions.assertEquals(actual, false);
	}
	
	@Test
	@DisplayName("primewithnotprime")
	void isPrimewithNotPrime() {
		boolean actual=numoperation.isprime(10);
		Assertions.assertEquals(actual, false);
	}

}
