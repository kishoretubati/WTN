package com.wipro.languagebasics;

public class patter {
public static void main(String[] args) {
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(j<5+i && j>5-i)
			{
			System.out.print("*");
			}
		}
		System.out.print("\n");
	}
}
}
