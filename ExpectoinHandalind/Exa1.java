package ExpectoinHandalind;

			import java.util.*;
			import java.lang.*;
			import java.io.*;

			/* Name of the class has to be "Main" only if the class is public. */
			class Exa1
			{
			  public static void main (String[] args) throws java.lang.Exception
			  {
			    // your code goes here
			    StringBuilder s = new StringBuilder("Hi999Hello wElcome");
			    for(int i =0;i<s.length();i++)
			    {
			        if(Character.isDigit(s.charAt(i)))
			        {
			            s.delete(i,i+1);
			            i -=1;//because next charcater will come to same position i
			        }
			        else if(Character.isUpperCase(s.charAt(i)))
			        {
			            s.replace(i,i+1,(s.charAt(i)+"").toLowerCase()); 
			        }
			        else{
			            s.replace(i,i+1,(s.charAt(i)+"").toUpperCase());
			        }
			    }
			  
			    StringBuffer str1=new StringBuffer();
			    str1=s;
			    String str2;
			    str2=str1.reverse();
			    System.out.println(s);
			    System.out.println(str2);
			  }
			}


