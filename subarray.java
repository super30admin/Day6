// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0) return 0;

        int count = 0;
        int rsum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for(int i=0;i<nums.length;i++) {
            rsum += nums[i];
            int diff = rsum - k;
            if(hm.containsKey(diff)) {
                count += hm.get(diff);
            } 

            if(hm.containsKey(rsum)) {
                 hm.put(rsum, hm.get(rsum) + 1);
            } else {
                hm.put(rsum, 1);
            }
        }

        return count;
    }

}