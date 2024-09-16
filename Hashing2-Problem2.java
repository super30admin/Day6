// Time Complexity :O(n)
// Space Complexity :O(n) n is number of elements
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

//Contiguous Array
// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer, Integer> map= new HashMap<>();
        map.put(0,-1);
        
        int maxLen=0,prefixSum=0;
        
        for(int i=0;i<nums.length;++i){
            
            int num=nums[i];
             prefixSum+= num==0? -1:num;
            
            if(map.containsKey(prefixSum)){
                
                maxLen=Math.max(maxLen,i-map.get(prefixSum));
            }
            else{
                
                map.put(prefixSum,i);
            }
        }
        return maxLen;
    }
}