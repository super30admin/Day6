// Time Complexity : O(n) --> where n is lengths of input array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode (560): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int rSum = 0;
        map.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            int compliment = rSum - k;
            
            if (map.containsKey(compliment)) count += map.get(compliment);
            if (!map.containsKey(rSum)) map.put(rSum, 0);
            map.put(rSum, map.get(rSum) + 1);
        }
        return count;
    }
}