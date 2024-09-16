/* Find total number of contiguous array equals to sum k */

// Time Complexity : O(N)
// Space Complexity : O(N)(Hashmap)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. because it was a tricky at first. but once i understood the pattern in problem2
//finding maximum length of runningSum, it made sense. the difference was we were keeping index for maximum length and here 
//we are keeping a count of subarrays.


// Your code here along with comments explaining your approach
//Here we have to find total number of contiguous subarrays.
//We will initialise hashmap and consider key as runningSum of each subarray starting from index 0 and assign its corresponding occurences as values
//then we will find complement using (rSum - target) and check if map contains(complement)
//if it does, increment count
//then if map contains(rSum), increment occurences(value) for that rSum in hashmap

class Solution {
    public int subarraySum(int[] nums, int k) {
        //edge case
        if(nums == null || nums.length == 0) return 0;
        int count = 0;
        //running sum of each subarray starting from index 0
        int runningSum = 0;
        //initialise hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        //initialise hashmap with adding 0 and corresponding 1 value
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            runningSum += nums[i];
            //finding complement of each runningSum by subtracting from target
            int complement = runningSum - k;
            //check if map contains complement
            if(map.containsKey(complement)){
                count += map.get(complement);
            }
            //check if mapcontains ruuningSum then increment count by 1 and update the value corresponding to that runningSum
            if(map.containsKey(runningSum)){
                map.put(runningSum, map.get(runningSum)+1);
            }
            //else add new runningSum if it doesn't exist
            else {
                map.put(runningSum, 1);
            }
        }
        return count;
    }
}


//brute force approach-time O(N2) as we will consider two loops
//first we start with index o and store runningSum to check if it matches target at each iteration
//keep increasing count if it exists