// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0)return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum = 0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            rSum = nums[i]==0 ?rSum -1 : rSum +1;
            if(map.containsKey(rSum)){
                int curr = i-map.get(rSum);
                max = Math.max(max,curr);
            }else{
                map.put(rSum,i);
            }
        }return max;
    }
}