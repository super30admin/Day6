// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);

        int rsum = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {
                rsum++;
            } else {
                rsum--;
            }

            if(hm.containsKey(rsum)) {
                maxLength = Math.max(maxLength, i-hm.get(rsum));
            } else {
                hm.put(rsum, i);
            }
        }
        if(maxLength == Integer.MIN_VALUE) {
            return 0;
        }
        return maxLength;
    }
}