// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Binary array to have equal number of 0's & 1's

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen =0;
        int sum =0;
        
        // default as (0,-1) 0 is currSumm and -1 is len
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
        
          // If 0 exists -1 , if 1 exists +1
            if(nums[i] == 0) sum += 1;
            else if(nums[i] == 1) sum -= 1;
            
            // If sum already exists calculate the length
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i - map.get(sum));
            }
            else map.put(sum,i);
        }
        return maxLen;
    }
}
