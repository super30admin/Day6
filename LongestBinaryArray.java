// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
//In this approach , we have a current sum to which we add a 1 when we see a 0 in the array and subtratc a 1 when we see a 1 in the array.
//We store the current sum and the starting index in a hashmap.
//whenever we see the current sum repeating , we compare the current max length and the difference between current position in array to the 
//start index stored for this currentsum in the hashmap and this way we keep updating the max and return the max in the end.
class Solution {
    public int findMaxLength(int[] nums) {
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int currentSum = 0;
        int maxLen = 0;
        map.put(0,-1);
        
        for(int i = 0 ;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                currentSum = currentSum - 1 ;
            }
            else
            {
                currentSum = currentSum + 1 ;
            }
            
            if(map.containsKey(currentSum))
            {
                maxLen = Math.max(maxLen,i - map.get(currentSum));
            }
            else
            {
                map.put(currentSum,i);
            }
        }
        return maxLen;
    }
}