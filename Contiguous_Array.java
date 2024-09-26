// Time Complexity : O(n * sizeOfMap)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had a hard time coming up with an approach and had to refer a solution


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        map.put(0,-1);
        
        for(int i = 0; i<nums.length;i++){
            sum+=nums[i]*2 - 1;
            maxLen=Math.max(maxLen,i - map.getOrDefault(sum,i));
            map.putIfAbsent(sum,i);
        }
        
        return maxLen;
    }
}