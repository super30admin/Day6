// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        int currSum=0;
        int start_index=-1;
        hashMap.put(0,-1);// currsum, start_index -- this is for initial reference
        
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                currSum+=1;//encoding "1" for "0"
            }
            else{
                currSum-=1;//encoding "-1" for "1"
            }
            
            if(hashMap.containsKey(currSum)){// if currSum is already there, that means array is balanced before somewhere, so we get diff b/w two indices
                max = Math.max(max, i-hashMap.get(currSum));
            }
            else{
                hashMap.put(currSum,i);// else add the indice
            }
        }
        return max;
            
            
    }
}
