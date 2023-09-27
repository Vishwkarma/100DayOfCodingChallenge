package Arrays;

import java.util.Scanner;

public class Sort01 {
	 

	    public static void sortZeroesAndOne(int[] arr) {
	    	
	        int i=0;
	        int j=arr.length-1;

	        while(i<j){
	              while(arr[i]%2==0 ){
	                  i++;
	              }

	              while(arr[j]%2==1 ){
	                  j--;
	                  
	              }

	                if(i<j){
	            int temp=arr[j];
	            arr[j]=arr[i];
	            arr[i]=temp;
	            i++;
	            j--;
	        }
	 
	        }

	      
	    }
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the size of the array: ");
	    int size = scanner.nextInt();

	    int[] arr = new int[size];
	    System.out.println("Enter the elements of the array (0s and 1s only): ");
	    for (int i = 0; i < size; i++) {
	        arr[i] = scanner.nextInt();
	    }

	    sortZeroesAndOne(arr);

	    System.out.println("Sorted array: ");
	    for (int i = 0; i < size; i++) {
	        System.out.print(arr[i] + " ");
	    }

	}

}
