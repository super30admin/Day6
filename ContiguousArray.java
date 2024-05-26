// Time Complexity : O(N) => As we are travesing through the entire array
// Space Complexity : O(N) => To store the elements in the HashMap, in Worst case we might store all the N elements
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. Initialized max with Integer.MIN_VALUE which failed for few test cases

/*
Approach: Used HashMap & max variable. If the value is 0 then subtract -1 from running sum or add 1 for value 1.
Check if that running sum exists in the map, then compare the max value is greater than index of current element - index at which that runningSum was found.
Otherwise simply add the runningSum to map.
 */
class Solution {
    public int findMaxLength(int[] nums) {

        int rSum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0){
                rSum = rSum - 1;
            }
            else{
                rSum = rSum + 1;
            }

            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            }
            else{
                map.put(rSum, i);
            }
        }
        return max;
    }
}