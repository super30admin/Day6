// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// increase the sum by +1 if encounter 0 and -1 if encounter 1
// iterate through loop and if sum is 0 directly assign the (index+1)  value  as length to the max variable 
// maintain map to store sum as key and value as  index.
// if map already has value for particular sum then assign the Max = max between max and the (index - mapValue) 
// (index - mapvalue)  is length of the current array 

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int sum =0,max = 0;
        
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0) sum+=1;
            if(nums[i] == 1) sum-=1;
            
            if(sum ==0){
                max = i+1;
            }
            
            if(!h.containsKey(sum)){
                h.put(sum,i);
            }else{
                max = Math.max(max,i - h.get(sum));
            }
            
            
        }
        
        return max;
    }
}