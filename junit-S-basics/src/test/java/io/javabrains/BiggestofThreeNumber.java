package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BiggestofThreeNumber {
	
	BiggestofThreeNumbers obj;
	@BeforeEach
	void init() {
		obj=new BiggestofThreeNumbers();
	}

	@Test
	void BiggestAsFirstElement() {
		int actual=obj.biggest(30,20,10);
		Assertions.assertEquals(actual, 30);
	}
	
	@Test
	void BiggestAsSecondElement() {
		int actual=obj.biggest(10,30,20);
		Assertions.assertEquals(actual, 30);
	}
	
	@Test
	void BiggestAsThirdElement() {
		int actual=obj.biggest(10,20,30);
		Assertions.assertEquals(actual, 30);
	}
	
	@Test
	void Biggest() {
		int actual=obj.biggest(30,30,30);
		Assertions.assertEquals(actual, 30);
	}
	

}
