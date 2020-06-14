package com.wipro.languagebasics;

public class Primeor {
	public static void main(String args[]) {
		int n=Integer.parseInt(args[0]);
		boolean f= false;
		int i;
		for(i=2 ; i<n ;) {
			if(n%i==0)
				f=true;
			break;
		}
		if(f)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
			
	}


}
