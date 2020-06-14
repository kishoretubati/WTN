package com.wipro.languagebasics;

public class Gender {
	public static void main(String args[]){
		int age=Integer.parseInt(args[1]);
		if(args[0].length()==4 && age>=1&&age<=58){
		System.out.print("the percentage of interest is 8.4%");
		}
		else if(args[0].length()==4 && age>=59 && age<=100){
		System.out.print("the percentage of interest is 10.5%");
		}
		else if(args[0].length()==6 && age>=1&&age<=58){
		System.out.print("the percentage of interest is 8.2%");
		}
		else if(args[0].length()==6 && age>=59&&age<=100){
		System.out.print("the percentage of interest is 8.4%");
		}
		}


}
