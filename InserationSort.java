package Sorting;

import java.util.Scanner;

public class InserationSort {
	
     public static void inserationSort(int[] arr) {
    	 for(int i=1;i<arr.length;i++) {
    		 for(int j= i-1;j>=0;j--) {
    			 if(isGreater(arr,j,j+1)) {
    				 swap(arr,j,j+1);
    					 
    				 } else {
    					 break;
    			 }
    		 }
    	 }
     }
	
	public static void swap(int [] arr,int i,int j) {
		System.out.println("Swapping "+ arr[i]+ " and " + arr[j]);
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
		
	}
	
	public static boolean isGreater(int [] arr,int j,int i) {
		System.out.print(" Swapping " + arr[i]+ " " + arr[j]);
		if(arr[i]<arr[j]) {
			return true;
		} else {
		return false;
		
		}
	}

	public static void print(int [] arr) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i] +" ");
		 }
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i]= s.nextInt();
			
		}
		inserationSort(arr);
		print(arr);

	}

	}
