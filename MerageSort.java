package Sorting;
import java.io.*;
import java.util.*;


public class MerageSort {
	
	public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				res[k] = a[i];
				i++;
			} else {
				res[k] = b[j];
				j++;
			}
			k++;
		}
		
		while (i < a.length) {
			res[k] = a[i];
			i++;
			k++;
		}
		
		while (j < b.length) {
			res[k] = b[j];
			j++;
			k++;
		}
		
		return res;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println(); // Print a newline at the end.
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		int m = s.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = s.nextInt();
		}
		
		int[] mergedArrays = mergeTwoSortedArrays(a, b);
		print(mergedArrays);
	}

}
//package Sorting;
//import java.io.*;
//import java.util.*;
//
//public class MergeSort {
//	
//	
//}
