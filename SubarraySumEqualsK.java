// Time Complexity : O(n), where n is size of array
// Space Complexity : O(n), Hash table
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :




class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0;
        int sum = 0;
        map.put(0,1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];         
            if(map.containsKey(sum-k)){
                    total += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        } return total;             
    }
}
