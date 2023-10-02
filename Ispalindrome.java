package String;

import java.util.Scanner;

public class Ispalindrome {
	
	public static boolean isPalimDrome(String str) {
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
				
			}else {
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        boolean isPalindromic = isPalimDrome(input);

	        if (isPalindromic) {
	            System.out.println("The entered string is a palindrome.");
	        } else {
	            System.out.println("The entered string is not a palindrome.");
	        }

	        scanner.close();
	    }

	}


