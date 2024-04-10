// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, runningSum = 0;
        for(int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            int diff = runningSum - k;
            if(map.containsKey(diff)) {
                count = count + map.get(diff);
            }
            map.put(runningSum, map.getOrDefault(runningSum, 0)+1);
        }
        return count;
    }
}