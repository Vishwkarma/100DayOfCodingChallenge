package Arrays;

import java.util.Scanner;

public class IntersectionTwoArrays {
      
	public static void intersections(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					arr2[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements in the first array: ");
	        int n1 = scanner.nextInt();
	        int[] arr1 = new int[n1];
	        System.out.println("Enter the elements of the first array:");
	        for (int i = 0; i < n1; i++) {
	            arr1[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the number of elements in the second array: ");
	        int n2 = scanner.nextInt();
	        int[] arr2 = new int[n2];
	        System.out.println("Enter the elements of the second array:");
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = scanner.nextInt();
	        }

	        System.out.println("Intersection of the two arrays:");
	        intersections(arr1, arr2);

	        scanner.close();
	    }
		
	}

