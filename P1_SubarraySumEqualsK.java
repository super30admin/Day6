// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int count = 0;
        map.put(0,1);

        for(int i=0 ;i<nums.length ; i++) {
            rSum += nums[i];
            int y = rSum - k;
            if(map.containsKey(y)) {
                count += map.get(y);
            } 
            if(map.containsKey(rSum)) {
                map.put(rSum, map.get(rSum) + 1);
            } else {
                map.put(rSum, 1);
            }
        }
        return count;
    }
}