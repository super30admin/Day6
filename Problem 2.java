// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int length = 0;
        int rSum = 0;
        for(int i = 0;i < nums.length;i++)
        {
            if(nums[i] == 1)
            {
                rSum++;
            }
            else
                rSum--;
            
            if(map.containsKey(rSum))
            {
                length = Math.max( length, i - map.get(rSum));
            }
            else
            {
                map.put(rSum,i);
            }
        }
        return length;
        
    }
}