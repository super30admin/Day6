/* Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1. */

// Time Complexity : O(n) using hashmap
// Space Complexity : O(n) (we are using hashmap)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// we will iterate over array and we will create hashmap with binary number(0 or 1) with rSum as value
// rSum is maintained at each index so if O shows in array, decrement by 1 else increment by 1
// rSum is the recurring sum and once we reaches similar rSum in the hashmap, we will find 
// max(difference of current value index and rSum index)
// Max will give max length

class Solution {
    public int findMaxLength(int[] nums) {
        //edge case
        if(nums == null || nums.length <= 1) return 0;
        //initialise hash map 
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int max = 0;
        int rSum = 0;
        for(int i = 0; i < nums.length; i++){
            //condition: if 0 shows, decrement by 1 else increment by 1(in case of 1)
            rSum = nums[i] == 0 ? rSum - 1: rSum + 1;
            //check if map contains rSum already
            if(!map.containsKey(rSum)){
                map.put(rSum, i);
            } else {
                max = Math.max(max, i - map.get(rSum));
            }
        }
        return max;
    }
}



//brute force: O(n2)
//approach: we will keep index as first element and starts considering all elements
//starting from index+1 and so on.