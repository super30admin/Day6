// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, figuring out what to store in hash map for running sum.


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                rSum += 1;
            }else{
                rSum -= 1;
            }
            if(map.containsKey(rSum)){
                int currMax = i-(map.get(rSum));
                if(currMax > max) max = currMax;
            }else{
                map.put(rSum,i);
            }
        }
        
        return max;
        
    }
}