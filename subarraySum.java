// Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

// Time Complexity : o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * In this problem, hash map is used to store the calculated running sum and the frequency of its occurence. We update the frequency only when
 * the value we find for (running sum - target) has already occurred in the hash map. If it is not present we update the hash map with a new entry
 *  i.e., running sum and frequency as 1 as we are seeing it for the first time and finally we return the result.
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int runningSum = 0;
        int result = 0;
        map.put(0,1); // running sum 0 frequency 1 to capture edge case
        for(int i = 0; i<nums.length;i++){
            runningSum = runningSum + nums[i];
            int diff = runningSum -k;
            if(map.containsKey(diff)){
                result = result + map.get(diff);
                
            }
            // if(!map.containsKey(runningSum)){
            //     map.put(runningSum, 1);
            // }
            // else{
            //     map.put(runningSum, map.get(runningSum)+1);
            // }
            map.put(runningSum, map.getOrDefault(runningSum, 0)+1);
        }
        return result;
    }
}