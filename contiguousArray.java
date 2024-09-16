// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> count = new HashMap(); 
        count.put(0,-1);
        
        int max_length = 0;
        int counter = 0;
         
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                counter += -1;
            }
            else{
                 counter += 1;
            }
            
            if(count.containsKey(counter)){
                max_length = Math.max(max_length, i-count.get(counter));
            }
            else{
                count.put(counter,i); 
            }
        }
        
        return max_length;
    }