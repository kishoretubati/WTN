package com.wipro.languagebasics;

public class CommandLineArguments {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++)
		{
			if(args.length!=0)
			{
				System.out.println(args[0]+","+args[1]); 
				break;
			}
			
		}
		if(args.length==0)
		{
			System.out.println("no values entered in command argument.");
		}
	}

}
