// Time Complexity: O(n), n: length of nums array
// Space Complexity: O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int rSum = 0, maxLen = 0;
        map.put(0,-1);
        for(int i=0; i<nums.length; i++) {
            rSum += nums[i] == 0 ? -1 : 1; 
            if(!map.containsKey(rSum))
                map.put(rSum, i);
            else
                maxLen = Math.max(maxLen, i-map.get(rSum));
        }
        return maxLen;
    }
}