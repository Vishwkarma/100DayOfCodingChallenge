package Arrays;

import java.util.Arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,8,0};
		System.out.println("The Largest element in the array is :" +sort(arr1));
		
		int arr2[]= {8,10,5,7,9};
		System.out.println("The Largest element in the array is :"+ sort(arr2));	
 
		
		int arr3[]= {10,300,500,100,4};
		System.out.println("The Largest element in the array is :"+ findLargest(arr3));
		
		
	}
	
	//Optimal Approach T.C:O(N*log(N)) S.C:-O(n)
	
 private static int findLargest(int[] arr3) {
	    int max = arr3[0];
	    for(int i=0;i<arr3.length;i++) {
	    	if(arr3[i]>max) {
	    		
	    		max =arr3[i];
	    		
	    	}
	    	
	    }
		return max;
	}
 //Brute force Approach T.C:O(n) S.P :O(1)
 
static int sort(int arr[]) {
	 Arrays.sort(arr);
	 return arr[arr.length-1];
	 
	 
	 
 }
}
