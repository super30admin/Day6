// Time Complexity : O(n)
// Space Complexity : O(m)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Use running sum pattern
// Save the unique sums in map
// If the computed sum exists in the map, we compare the length saved in the map and the newly computed length and save whichever is greater


class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                sum--;
            }
            else {
                sum++;
            }
            if(map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            }
            else {
                map.put(sum, i);
            }
        }
        
        return max;
    }
}