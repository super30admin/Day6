// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int rSum = 0;
        map.put(0,1);
        
        for(int i = 0; i < nums.length; i++){
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k))
                result = result + map.get(rSum - k);
            map.put(rSum, map.getOrDefault(rSum,0) + 1);
        }
        return result;
    }
}
