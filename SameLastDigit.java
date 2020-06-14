package com.wipro.languagebasics;

public class SameLastDigit {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int c=Integer.parseInt(args[1]);
		if(a%10==c%10) {
		System.out.println("TRUE");
	     }
		else
		{
			System.out.println("FALSE");
		}

}
}