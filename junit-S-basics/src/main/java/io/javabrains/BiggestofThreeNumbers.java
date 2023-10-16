/**
 * 
 */
package io.javabrains;

/**
 * 
 */
public class BiggestofThreeNumbers {
	
	public int biggest(int a, int b, int c) {
		
		if(a>b && a>c) {
			return a;
		}
		else if(b>c) {
			return b;
		}
		else {
			return c;
		}
	
	}

}
