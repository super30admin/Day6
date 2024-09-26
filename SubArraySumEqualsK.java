// Time Complexity :o(N)
// Space Complexity :o(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO
// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(sum,1);
        
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            
            int comp = sum - k;
            
            if(hashmap.containsKey(comp)){
                count+= hashmap.get(comp);
            }
            
            if(!hashmap.containsKey(sum)){
                hashmap.put(sum,1);
            }else{
                hashmap.put(sum,hashmap.get(sum)+1);
            }
        }
        
        return count;
    }
}