package Sorting;

public class duplicateNumber {
      
public static int duplicateNumber(int arr[]) {
    	
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                     return arr[i];

                }
            }
          
        }
          return -1;
    }
		
	
	public static void main(String[] args) {
		
		  int[] arr = {1, 2, 3, 4, 4, 5};
	        
	        // Call the findDuplicateNumber method
	        int duplicate = duplicateNumber(arr);
	        
	        if (duplicate != -1) {
	            System.out.println("Duplicate number found: " + duplicate);
	        } else {
	            System.out.println("No duplicate number found.");
	        }
	    }

	}


