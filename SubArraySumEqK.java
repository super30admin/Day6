// Time Complexity : O(N) - N is length of the array
// Space Complexity : O(N) - as hashmap will increase with running Sum.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        //to cover base case.
        map.put(0, 1);
        int count = 0;
        int rSum = 0;

        for(int i = 0; i<nums.length; i++) {
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k)) {
                count = count + map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0)+1);
        }
        return count;
    }
}