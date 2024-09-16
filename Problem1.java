// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length == 0){ return 0; }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0; int count=0;
        for(int i=0;i<nums.length;i++){
            sum= sum + nums[i];
            if(map.containsKey(sum-k)){
            count += map.get(sum-k);
            }
            if(!map.containsKey(sum)){
                map.put(sum,1);
            }else{
                map.put(sum,map.get(sum)+1);
            }
        }
        return count;
    }
}