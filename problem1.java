// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        
        hashmap.put(0,1);
        int sum = 0;
        int count = 0;
        
        for(int i = 0 ; i< nums.length;i++){
            
            sum += nums[i];
            
            if(hashmap.containsKey(sum - k)){
                count = count + hashmap.get(sum - k);
            }
            
            if(!hashmap.containsKey(sum)){
                hashmap.put(sum,0);   
            } 
            
            hashmap.put(sum,hashmap.get(sum)+1);
           
        }
        
        return count;
    }
}