// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


import java.util.HashMap;

// Your code here along with comments explaining your approach
// Storing the running sum of the array in hashmap
//Cheking for the diff of current index and value of running sum occured before in the hashmap.
// Check for the longest and update the variable

public class LongestArrofZerosNOnes {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int longestArr = 0;
        int runningSum =0;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        myMap.put(0,-1);


        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                runningSum += 1;
            }else{
                runningSum -= 1;
            }
            if(!myMap.containsKey(runningSum)){
                myMap.put(runningSum,i);
            }else if(myMap.containsKey(runningSum)){
                int len = i-myMap.get(runningSum);
                if(len>longestArr){
                    longestArr = len;
                }
            }
        }
        return longestArr;

    }
}
