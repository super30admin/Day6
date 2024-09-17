// Time Complexity : O(n) 
// Space Complexity : O(n) worst case we have to store every number
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I was stuck initally becasue I didnt add the base case (0,1) to map


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        
        map.put(0, -1); // base case
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i]==1 ? 1: -1; // adding -1 for when element is 0
            
            if(map.containsKey(sum))
                maxLen = Math.max(maxLen, i-map.get(sum)); //if we found the same sum again 
            else
                map.put(sum, i);
        }
        return maxLen;
    }
}