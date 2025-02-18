 // Time Complexity :o(n)
// Space Complexity :o(n) 
// Did this code successfully run on Leetcode : it runs good in leat code
// Any problem you faced while coding this : no

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int rSum = 0;
        int output = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            rSum += nums[i];
            if (map.containsKey(rSum - k)) {
                output = output + map.get(rSum - k);
            }
            if (!map.containsKey(rSum)) {
                map.put(rSum, 1);
            } else {
                map.put(rSum, map.get(rSum) + 1);
            }
        }
        return output;
    }
}