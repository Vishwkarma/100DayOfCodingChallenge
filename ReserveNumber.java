package EasyCode;

import java.util.Scanner;

public class ReserveNumber {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();

		int rev=0;
       

		while(n!=0){

			int last =n%10;

			rev=rev*10+last;

			n=n/10;


		}
    System.out.print(rev);
	}

	}


