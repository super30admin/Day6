// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        // base case
        if(nums == null || nums.length == 0) return 0;

        // using HashMap to store rSum(key) and it's first occurance index(value)
        Map<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int rSum = 0;

        // to address boundry condition we will add rSum found at -1 index
        map.put(rSum, -1);

        // TC: O(N)
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                rSum++;
            }
            else {
                rSum--;
            }

            if(!map.containsKey(rSum)) {
                // add first occurance of rSum in Map
                // add rSum(key) and i(index as value)
                map.put(rSum, i);
            }
            else {
                // if it already contains calculate length and compare it earlier length and map maximum length
                len = Math.max(len, i - map.get(rSum));
            }
        }

        return len;
    }
}