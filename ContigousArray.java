
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : map.containsKey can have any value - logically this makes sens as when the 
//count is equal too first index of count, the number of values in it are equal.(neutral)


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        
        map.put(0,-1);
        
        int maxLen = 0;
        int count =0;
        
        for(int i = 0; i<nums.length ; i++)
        {
            count = count + (nums[i] ==1? 1: -1);       //Making count 0 f0r 0 and -1 for 1
            if(map.containsKey(count))
            {
                maxLen = Math.max(maxLen, i - map.get(count));
            }   else {
                map.put(count, i);
            }
        }
        
        return maxLen;
    }
}
