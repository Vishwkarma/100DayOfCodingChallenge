package Arrays;

import java.util.Arrays;

public class SecondSmallestAndSecondLeargest {
	
     //T.C : O(NlogN) S.C: O(1)
	
	static private void getElements(int arr[],int n) {
		if(n==0||n==1) {
			System.out.println(-1);
			System.out.println(" ");
			System.out.print(-1);
			System.out.print("\n");
			
			
		}
		int small =Integer.MAX_VALUE;
		int second_small =Integer.MAX_VALUE;
		int large= Integer.MIN_VALUE;
		int second_large=Integer.MIN_VALUE;
		int i=0;
		
		for( i=0;i<n;i++) {
			small=Math.min(small, arr[i]);
			large=Math.max(large, arr[i]);
				
			
		}
		for( i=0;i<n;i++) {
			if(arr[i]<second_small && arr[i]!= small) {
				second_small =arr[i];
				
			}
			if (arr[i] > second_large && arr[i] != large)
			{
				second_large = arr[i];
			}
			
		}
		System.out.println("Second smallest is "+second_small);
		System.out.println("Second largest is "+second_large);
	}
//		Brute-Force Approach
//		Arrays.sort(arr);
//		int small = arr[1];
//		int large = arr[n-2];
//		System.out.println("Second smallest is "+ small);
//		System.out.println("Second largest is "+ large);
//		
//	}
		
	
	public static void main(String[] args) {
		int []arr = {1,2,4,6,7,8};
		int n =arr.length;
		getElements(arr,n);

	}

}
