// Time Complexity : O(N) , N is length of array
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        int rsum = 0, count = 0;
        
        hmap.put(0,1);
        
        for (int i = 0; i < nums.length; i++) {
            rsum += nums[i];
            int compl = rsum - k;
            if(hmap.containsKey(compl)) {
                count += hmap.get(compl);
            }
            if(!hmap.containsKey(rsum)) {
                hmap.put(rsum, 1);
            }
            else {
                hmap.put(rsum, hmap.get(rsum) + 1);
            }
        }
        return count;
    }
}