// Time Complexity :O(n)
// Space Complexity :O(n) n=no of elements
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
// Subarray Sum Equals K

// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        HashMap<Integer, Integer> map =new HashMap<>();
        map.put(0,1);
        
        int count=0,prefixSum=0;
        
        for (int num :nums){
            
            prefixSum+=num;
            
            if(map.containsKey(prefixSum-k))
            {
                
                count+=map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
       return count; 
    }
}