// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int res=0;
        int rSum=0;
        for(int i=0; i<nums.length; i++){
            rSum+=nums[i];
            if(map.containsKey(rSum-k)){
                res+=map.get(rSum-k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0)+1);
        }
        return res;
    }
}
