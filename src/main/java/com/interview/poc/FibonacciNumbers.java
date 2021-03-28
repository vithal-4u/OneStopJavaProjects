package com.interview.poc;

public class FibonacciNumbers {
	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		System.out.println("Printing N -----------" + n);
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String args[]) {
		int n = 10;
		System.out.println(fibonacci(n));
	}
}
