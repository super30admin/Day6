// Time Complexity: O(n), n: length of nums array
// Space Complexity: O(n), n: total sumarray sums stored in the map
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int rSum = 0, count = 0;
        for(int i=0; i<nums.length; i++) {
            rSum += nums[i]; 
            if(map.containsKey(rSum-k))
                count += map.get(rSum-k);
            map.put(rSum, map.getOrDefault(rSum,0)+1);
        }
        return count;
    }
}