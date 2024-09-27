// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
            if(map.containsKey(sum - k)) {
                count = count + map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
