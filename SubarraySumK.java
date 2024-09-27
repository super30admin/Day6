// Time Complexity : O(n) - one for loop running throughout the input array
// Space Complexity : O(n) - to store running sum at every index in the Hash map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

import java.util.*;
class SubarraySumK {
    public int subarraySum(int[] nums, int k) {  
        if(nums == null || nums.length == 0) return 0;   //edge case to test if array is empty
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int runSum = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++)
        {
            runSum += nums[i];    // calculate running sum at every index
            int compliment = runSum - k;
            if(map.containsKey(compliment))
            {   
                count += map.get(compliment); //if compliment is present in the array, increment count by value at compliment in the map
                
            }
            if(!map.containsKey(runSum))
            { //if running sum is missing in the hashmap, add the running sum 
                map.put(runSum, 1);
            }
            else{ //if running sum exists in the array, add 1 to the value corresponding to the running sum
                map.put(runSum, map.get(runSum) + 1);   
            }
        }
    return count;  //finally return the total count value
    }
}


//Main class

class Main
{
    public static void main(String[] args)
    {
    SubarraySumK obj = new SubarraySumK();
    int[] input = {1, 1, 1};
    int k = 2;
    System.out.print("Subarray sum for k = " + k + " is: " +  obj.subarraySum(input, k) + "\n"); //returns 2
    }
}