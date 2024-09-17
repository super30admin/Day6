// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO
// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap();
        map.put(0, -1);
        int sum = 0;
        int ans = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                sum += -1;
            else
                sum += 1;
            
            if(map.containsKey(sum)){
                ans = Math.max(ans, i - map.get(sum));
            }
            map.put(sum, i);
        }
        return ans;
    }
}