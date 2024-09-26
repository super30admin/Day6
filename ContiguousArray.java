// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>(); 
        // key: smallest index; value: count of 1-count of 0 up to this point
        map.put(0, -1);
        int maxLen = 0;
        int count = 0; 
        for(int i=0; i<nums.length; i++){
            count += nums[i]==1? 1:-1;
            if( map.containsKey(count) ) 
                maxLen = Math.max(maxLen, i-map.get(count));  
            else
                map.put(count, i);
        }
        return maxLen;
    }
}