// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        hashmap.put(0,-1);
        
        for(int i = 0 ; i<nums.length;i++){
          
            
            if(nums[i]==0){
                sum = sum + -1;
            }else{
                sum = sum + nums[i];
            }
            
            if(hashmap.containsKey(sum)){
                maxLength = Math.max(maxLength,i-hashmap.get(sum));
            }else{
                hashmap.put(sum,i);
            }        
        }
        
        return maxLength;
    }
}