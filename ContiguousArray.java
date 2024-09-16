// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We will take the prefix at each step and store the corresponding index on every step in a map
// Instead of 0 we will consider it as -1
// If we find the prefix is there in the map we will get its index and subtract it with our 
// current index to get the length of equal 0s and 1s
// We will keep checking for the max to fetch the highest value/length of equal 0s and 1s

class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int prefix = 0;
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            prefix += (cur == 0)?-1:cur;
            if(hm.containsKey(prefix)){
                max = Math.max(max, i - hm.get(prefix));
            }
            else{
                hm.put(prefix, i);
            }
        }
        return max;
    }
}