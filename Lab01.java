//@name Troy Sorongon
//@date and version 2/3/2022
//CS245 Lab 1: Find the Missing Number

import java.util.Arrays;
import java.util.Collections;
public class Lab01{
    //method to find the missing number in unsorted array
    //@param int array of given numbers
    //@returns int missing number
    public static int findMissingNum(int[] nums){
        //[TODO] your solution to the find the missing number
    	

    	
    	int max = nums[0];				// Finding the maximum number in the array
    	for(int i = 0; i<n; i++) {
    		if(nums[i] > max) {			// If a value in the array is bigger than the max, max is assigned the new value
    			max = nums[i];
    		}
    	}
    	
    	int sum = 0;					
    	for(int a = 0; a <= max; a++) {		// Using a for loop to find the summation of 0(assuming the smallest number in the array 
    		sum+=a;							// is 0) to max
    	}
    	
    	
    	int arraySum = 0;
    	for(int j = 0; j < n; j++) {		// Using a for loop to find the sum of the array
    		arraySum+=nums[j];
    	}
    	
    	if(sum - arraySum == 0) {			// If the array does not contain a missing number, the missing value is the max number
    		max += 1;						// Therefore, the current max number is false and needs to add 1 to find the new max, 
    		return max;						// and thus the missing number in the array
    	}
    	
    	return sum - arraySum;				// Subtracting the sum of the array from the summation of 0 to max will find the missing number
    		
    	
    }
    
    public static void main(String[] args){
        int[] test1 = new int[] {2,5,7,6,1,3,0}; //returns 4
        int[] test2 = new int[] {1,0,5,3,4,2}; //returns -1
        int[] test3 = new int[] {5,3,4,2,1}; //returns 0
        
        System.out.println(findMissingNum(test2));
        
    }
    
}
