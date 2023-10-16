package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class MathUtilsTest {
	
	
	MathUtils mathutils;
	
	@BeforeAll
	static void beforeallunit() {
		System.out.println("needs to run before all");
	}
	
	@BeforeEach
	void init() {
		mathutils=new MathUtils();
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("cleaninng up the code");
	}
	
	@Nested
	class addtest{
		
		@Test
		@DisplayName("add numbers")
		
		void Testadd() {
			assertEquals(3, mathutils.add(1, 2), "the add number should add two numbers");
		}
		
		
		void Testaddnegative() {
			
			assertEquals(-2, mathutils.add(-1, -1), "the add number should add two numbers");
		}
	}
	
	
	@Test
	@DisplayName("Exceptions")
	
	void Testdivide() {
		assertThrows(ArithmeticException.class, ()->mathutils.divide(1, 0));
	}
	
	
	void testmultiply() {
		assertAll(
				()-> assertEquals(4, mathutils.multiply(2,2)),
				()-> assertEquals(0, mathutils.multiply(2,0))
				);
	}
	
	@Test
	@DisplayName("radius")
	@RepeatedTest(3)
	void testcomputeCircleradius() {
		assertEquals(314.1592653589793, mathutils.computeCircleArea(10), "this is for radius");
	}

}
