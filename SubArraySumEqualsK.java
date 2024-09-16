// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int sum = 0;
        int result = 0;
        
        for(int i=0; i<nums.length ; i++){
            sum += nums[i];
            
            if(map.containsKey(sum-k)){
                result += map.get(sum-k);
            
            }
                
            map.put(sum , map.getOrDefault(sum,0)+1);
        }
        
       return result; 
    }
}