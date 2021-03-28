package com.interview.poc;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		System.out.println(pal.checkPalindromeString("TRIRT"));
	}
	
	public boolean checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();
		for(int i=0; i < length/2; i++) {
			if(input.charAt(i) != input.charAt(length-i-1)) {
				result = false;
				break;
			}
		}
		return result;
	}
}
