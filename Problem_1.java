// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int cmpl = 0;
        int count = 0;
        int sum = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            cmpl = sum - k;
            if(map.containsKey(cmpl)){
                count += map.get(cmpl);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
