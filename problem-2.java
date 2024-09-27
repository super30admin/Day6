// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 ,-1);
        int max=0;
        int rSum=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1)
                rSum++;
            else
                rSum--;
            if(map.containsKey(rSum)){
                max=Math.max(max, i-map.get(rSum));
            }
            else{
                map.put(rSum, i);
            }
        }
        return max;
    }
}
