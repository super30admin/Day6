// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


import java.util.HashMap;

// Your code here along with comments explaining your approach
// Storing the running sum of the array in hashmap
//Cheking for the diff of running sum and target in the hashmap. Increase the counter if present.

public class SubArrSumEqualtoTarget {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> myMap = new HashMap<>();

        myMap.put(0,1);
        int runningSum =0;
        int counter =0;

        for(int i=0; i<nums.length; i++){
            runningSum += nums[i];


            int diff = runningSum - k;

            if(myMap.containsKey(diff)){
                counter+=myMap.get(diff);
            }
            if(!myMap.containsKey(runningSum)){
                myMap.put(runningSum,1);
            }else{
                int val = myMap.get(runningSum);
                myMap.put(runningSum, val+1);
            }


        }//end of for
        return counter;

    }
}
