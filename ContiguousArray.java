class Solution {
    public int findMaxLength(int[] nums) {
        int count = 0;
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i =0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                count = count - 1;
            }
            else
            {
                count = count + 1;
            }
            if (map.containsKey(count))
            {
                maxLength = Math.max(maxLength , i - map.get(count));
            }
            else
            {
                map.put(count , i);
            }
        }
        return maxLength;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n). n is number of elements in hashmap.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


