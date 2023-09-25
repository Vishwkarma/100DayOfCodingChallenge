package Sorting;

public class swapAlternate {
	
	public static void swapAlternate(int [] arr) {
		for(int i=0;i<arr.length-1;i=i+2) {
			int a ;
			a = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=a;
		}
	}

	public static void main(String[] args) {
		// Create an array to test the swapAlternate method
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		// Print the original array
		System.out.println("Original Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		// Call the swapAlternate method
		swapAlternate(arr);
		
		// Print the swapped array
		System.out.println("Swapped Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
