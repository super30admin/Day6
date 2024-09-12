// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);			// initialize the map with default values for index and count
        int maxlen = 0, count = 0;		
        for (int i = 0; i < nums.length; i++) {		// traverse through the array
            count = count + (nums[i] == 1 ? 1 : -1);	// calculating the count accordingly
            if (map.containsKey(count)) {				// check if the key is present in the map already
                maxlen = Math.max(maxlen, i - map.get(count));		// if yes, compare with maxlen and map value to determine the biggest number
            } else {
                map.put(count, i);			// else put the new elements 
            }
        }
        return maxlen;			// return the maximum length in the map
    }
}