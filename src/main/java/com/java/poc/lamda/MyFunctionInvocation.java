package com.java.poc.lamda;

public class MyFunctionInvocation {


	public static void main(String[] args) {
		new MyFunctionImpl().getCustomFunction(new MyFunction() {
			
			public void printString(String str) {
				System.out.println("Inside the Implementation");
				System.out.println(str);
			}
		});
		
		String str1="Inside the Implementation";
	
	}
	

}
