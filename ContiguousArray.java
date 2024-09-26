// Time Complexity :o(N)
// Space Complexity :o(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        
        int sum=0;
        int max=0;
        
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0){
                sum+=1;
            }else{
                sum-=1;
            }
            
            if(sum==0){
                max= i+1;
            }
            
            if(!hashmap.containsKey(sum)){
                hashmap.put(sum, i);
            }else{
                max= Math.max(max,i-hashmap.get(sum));
            }
        }
        return max;
    }
}