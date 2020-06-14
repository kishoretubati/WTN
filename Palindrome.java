package com.wipro.languagebasics;

public class Palindrome {
	public static void main(String[] args)
	{
		int k=0,s=0,c;
		int a=Integer.parseInt(args[0]);
		c=a;
				while(a!=0)
				{
					s=a%10;
					k=k*10+s;
					a=a/10;
					
				}
				if(k==c)
				{
		System.out.println(k+"is a palindrome");
	}
				else
				{
					System.out.println(c+"is not a palindrome");
				}
}
}
