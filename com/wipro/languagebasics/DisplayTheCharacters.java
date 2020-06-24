package com.wipro.languagebasics;

public class DisplayTheCharacters {
	public static void main(String args[]) {
	 if(args[0].charAt(0) < args[1].charAt(0))
		 System.out.println(args[0]+","+args[1]);
	 else
		 System.out.println(args[1]+","+args[0]);
	}

}
