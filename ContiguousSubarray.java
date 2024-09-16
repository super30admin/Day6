// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null){
            return 0;
        }
        
        // Running sum
        int rSum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Dummy value to handle the base case [0,1] or [1,0] etc
        map.put(0, -1);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                rSum--;
            }
            else{
                rSum++;
            }
            if(map.containsKey(rSum)){
                maxLength = Math.max((i - map.get(rSum)), maxLength);
            }
            else{
                map.put(rSum, i);
            }
        }
        
        return maxLength;
    }
}
