package Sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		for(int itr =0;itr<=arr.length-1;itr++) {
			for(int j=0;j<arr.length-itr-1;j++) {
				if(isSmaller(arr,j+1,j)) {
					swap(arr,j+1,j);					
				}
				
			}
		}
	}
	//Used for swapping ith and jth elements of arrays 
	public static void swap(int arr[],int i,int j) {
		System.out.println(" Swapping " + arr[i] + " and " + arr[j]);
			
		int temp =arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
		
	}
	//return true if ith element is smaller than jth element
	public static boolean isSmaller(int[] arr,int i,int j) {
		System.out.println(" Comparing "+arr[i]+ " and " + arr[j]);
		
			if(arr[i]<arr[j]) {
				return true;
			}else {
				 return false;
			}
	}	
	public static void print(int [] arr) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i] +" ");
		 }
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr= new int[n];
		for(int i =0;i<n;i++) {
			arr[i]= s.nextInt();
			
		}
		
		bubbleSort(arr);
		print(arr);
	}

}
