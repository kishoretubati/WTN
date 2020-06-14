package com.wipro.languagebasics;

public class CharacterVariable {
	public static void main(String[] args) 
	{
		char ch='5' ;
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("alphabhet");
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("digit"); 
		}
		else
		{
			System.out.println("special character");
		}
	}

}
