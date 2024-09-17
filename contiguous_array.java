// Time Complexity : O(n), where n is the size of the input array
// Space Complexity :O(n), where n is the size of input array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        //Return 0, if input array is null or empty
        if(nums == null || nums.length ==0) return 0;
        
        //hashMap to store runningSum along with its first occurenece
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int max=0;
        int runningSum =0;
        
        //to handle the edge case of finding first contiguous sub array
        hMap.put(0, -1);
        
        //at every index
        for(int i=0; i<nums.length; i++){
            //calculate the running sum by adding 1 for every 1 and -1 for every 0
            runningSum = nums[i]==1 ? runningSum+1 : runningSum -1;
            //check if the hashMap already contains the runningSum
            if(hMap.containsKey(runningSum)){
            //If yes, then calculate the compliment of current index of running sum
            // with the index of runnning sum in the hashMap, and this will give you
            // the size of the current contiguous sub array
                int compliment = i - hMap.get(runningSum);
                
                //update the max value
                max = Math.max(max, compliment);
            }
            else{
                //if hashmap doesnot contain the runningSum, add the runningSum along
                //with its index (representing first appearance of this runningSum)
                hMap.put(runningSum, i);
            }
        }
        //In the end return the max
        return max;
    }
}