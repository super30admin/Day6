// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes , first check rsum - k exists, increase the count variable and then add +1 to the rsum in the HashMap. Edge case ([1],0) as an example.

// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int rsum = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            rsum = rsum + nums[i];
            if (map.containsKey(rsum - k)) {
                result = result + map.get(rsum - k);
            }
            if (map.containsKey(rsum)) {
                map.put(rsum, map.get(rsum) + 1);
            } else {
                map.put(rsum, 1);
            }

        }
        return result;
    }
}
