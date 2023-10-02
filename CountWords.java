package String;

import java.util.Scanner;

public class CountWords {
	  public static int CountWords(String str) {
   	   int count=0;
   	   if(str.length()==0) {
   		   return 0;
   		   
   	   }
          for(int i=0;i<str.length();i++) {
	    if(str.charAt(i)==' ') {
		count++;
		
	     }
       }
       return count+1;

	  }
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 System.out.print("Enter a string :");
		 String input = s.nextLine();
		 
		 int wordCount = CountWords(input);
		 System.out.println("Number of words "+ wordCount);
		 
		 s.close();
		 
		 
		 
       }
	
}

