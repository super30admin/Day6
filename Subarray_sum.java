// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Use running sum to save it as a key in hash map and how many times it is seen 
// as a value.  
// if running sum at index - k -> is present in hash map add that count to the result

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int rSum = 0;
        int cnt = 0;

        HashMap<Integer, Integer> map = new HashMap<>(); 
        map.put(rSum, 1); // edge case [3, 4]

        for(int i =0 ; i<nums.length; i++){
            rSum += nums[i];
            if(map.containsKey(rSum-k)){
                cnt += map.get(rSum-k);
            }
            map.put(rSum, map.getOrDefault(rSum,0) +1);
        }
        return cnt;
    }
    