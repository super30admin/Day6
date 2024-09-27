/**
// Time Complexity : O(n) (size of array)
// Space Complexity : O(n) (size of array)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :N/A
 */
class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0, rSum=0;
        map.put(0,-1); //for edge case, else end result won't consider initial element
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                rSum--;
            else
                rSum++;
            if(map.containsKey(rSum))
                max = Math.max(max, i - map.get(rSum));
            else
                map.put(rSum,i);
        }
        return max;
    }
}