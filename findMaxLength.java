// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int maxLen = 0;
        int currSum = 0;
        hashMap.put(0,-1);
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x] == 0)
                currSum += 1;
            else
                currSum -= 1 ;//change currsum
        
        if(hashMap.containsKey(currSum))//check if the currsum is already hashMapped or not 
        {
            maxLen = Math.max(maxLen,x-hashMap.get(currSum));
        }
            else
            {
                hashMap.put(currSum,x);
            }
    }
    return maxLen;//returns max length
 }
    
}

//TC O(n)
//SC O(n)