package io.javabrains;

public class NumberOperations {
	public boolean isprime(int num) {
		if(num<2 || (num%2==0 && num!=2)) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
