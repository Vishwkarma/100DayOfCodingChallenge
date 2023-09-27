package Arrays;

import java.util.Scanner; // import the Scanner class for user input

public class findTriplet {
             
	public static int findTriplet(int[] arr,int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						count++;
					}
				}
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // create a Scanner object
		System.out.println("Enter the size of the array: "); // prompt the user for the size of the array
		int n = sc.nextInt(); // read the size from the user
		int[] arr = new int[n]; // create an array of size n
		System.out.println("Enter the elements of the array: "); // prompt the user for the elements of the array
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt(); // read each element from the user and store it in the array
		}
		System.out.println("Enter the value to find triplets: "); // prompt the user for the value to find triplets
		int x = sc.nextInt(); // read the value from the user
		int result = findTriplet(arr,x); // call the findTriplet method with the array and the value as arguments
		System.out.println("The number of triplets that sum up to " + x + " is: " + result); // print the result
		sc.close(); // close the Scanner object
	}

}
