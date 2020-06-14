package com.wipro.languagebasics;

public class Variable {
	public static void main(String args[]) {
		if(args[0].charAt(0)>='a'&& args[0].charAt(0)<='z')
		System.out.println(args[0].toUpperCase());
		else
			System.out.println(args[0].toLowerCase());
	}

}
