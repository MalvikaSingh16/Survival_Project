package com.training.sapient;

public class PrimeNumberFinder {

	public boolean isPrime(int a) {
		if(a  <= 0) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) {
				return false;
			}
			
		}
		return true;
	}
}
