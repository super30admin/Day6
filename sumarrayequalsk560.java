// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        int rsum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i = 0;i<nums.length;i++){
            rsum = rsum + nums[i];
            if(map.containsKey(rsum-k)){
                count = count + map.get(rsum-k);
            }
            map.put(rsum, map.getOrDefault(rsum,0)+1);
        }

        return count;
    }
}