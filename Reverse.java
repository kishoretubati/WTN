package com.wipro.languagebasics;

public class Reverse {
	public static void main(String[] args)
	{
		int k=0,s=0;
		int a=Integer.parseInt(args[0]);
				while(a!=0)
				{
					s=a%10;
					k=k*10+s;
					a=a/10;
					
				}
		System.out.println(k);
	}

}
