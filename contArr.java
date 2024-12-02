import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Didn't fully understand the approach, used the concept of prefix sum and then implemented using hash map.

class contArr {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        map.put(0,-1);

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) sum--;
            else sum++;
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i-map.get(sum));
            }
            else {
                map.put(sum, i);
            }

        }
        return maxLen;
    }
}