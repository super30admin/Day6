// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int currSum = 0;
        int maxLength = 0;
        hashMap.put(0,-1);
        
        for(int i=0; i<nums.length; i++){
           if(nums[i] == 0)
               currSum += 1;
            else
                currSum -= 1;
            
            if(hashMap.containsKey(currSum)) {
                maxLength = Math.max(maxLength, i- hashMap.get(currSum));
            }
            else {
               hashMap.put(currSum, i); 
        }
        }
        return maxLength;
    }
}