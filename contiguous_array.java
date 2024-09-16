// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Couldn't solve before class.


// Your code here along with comments explaining your approach: Same as class

class Solution {
    public int findMaxLength(int[] nums) {
        
        //sanity check
        if(nums == null || nums.length == 0)
            return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int rSum = 0;
        int maxans = 0;
        
        for(int i=0; i<nums.length; i++){
           rSum = nums[i] == 0 ? rSum - 1 : rSum + 1; 
           if(!map.containsKey(rSum)){
               map.put(rSum, i);
           }else{
               maxans = Math.max(maxans, i - map.get(rSum));
           }            
        }
        
        return maxans;
    }
}