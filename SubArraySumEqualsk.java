// Time Complexity : O(N) => As we are travesing through the entire array
// Space Complexity : O(N) => To store the elements in the HashMap, in Worst case we might store all the N elements
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: Used HashMap and a count variable. Calculated running sum for each index. Check if running sum - k exists in the map then increment the count variable and store the running sum in map.
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        int rSum = 0;
        int count = 0;
        HashMap<Integer, Integer> sum = new HashMap<>();
        sum.put(0,1);

        for(int i =0; i < nums.length; i++){
            rSum = rSum + nums[i];

            //Checks if rSum - k exists which indicates a completement exist so increment count
            if(sum.containsKey(rSum - k)){
                count = count +sum.get(rSum -k);
            }

            //if that running sum already exists simply add 1 to it's value or create a new entry
            sum.put(rSum, sum.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }
}