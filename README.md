# CS245-Lab01
findMissingNum


The algorithm to finding the missing number in the array:
  
    1. Found the max value in the array using a for loop 
    2. Created a new int variable "sum" and initialized it to 0
    3. Using a for loop, "sum" is equal to the summation from 0 to max number
    4. Created a new int variable "arraySum" and initialized it 0
    5. Using a for loop, "arraySum" is equal to the summation of the ints in the array
    6. If (sum-arraySum == 0) statement used for when there is not missing number in the array.
       Therefore, the mising number is the max number. The current max number is false so the new 
       max is the max + 1. The new max is returned because it is the missing number
    7. return (sum - arraySum) to find the missing number in the array.
