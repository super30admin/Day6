// Time Complexity : O(N) integers getting stored in hashmap
// Space Complexity : O(N) used hashmap
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : Couldn't solve problem on my own before class.


// Your code here along with comments explaining your approach: Same as class

class Solution {
    public int subarraySum(int[] nums, int k) {
       
        if(nums == null || nums.length == 0)
            return 0;
        
        int rSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        
        for(int i=0; i < nums.length; i++){
            rSum += nums[i];
            int complement = rSum-k;
            
            if(map.containsKey(complement)){
                count += map.get(complement);
            }
            
            if(!map.containsKey(rSum)){
                map.put(rSum, 1);
            }else{
                map.put(rSum, map.get(rSum) + 1);
            }
        }
        
        return count;
    }
}