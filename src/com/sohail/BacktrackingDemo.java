package com.sohail;

public class BacktrackingDemo {

	static void print(int n) {
		if(n>3)
			return;
		System.out.println(n);
		print(n+1);
		System.out.println("Backtraking from " + n);
	}
	public static void main(String[] args) {
		print(1);
	}

}
