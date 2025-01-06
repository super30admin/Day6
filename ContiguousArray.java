//Time Complexity = O(n)
//Space.Complexity = O(n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: I faced problem while calculating ruuning sum, 
// but after watching the video of this problem I was able to solve

// Your code here along with comments explaining your approach in three sentences only
/**
 * Approach: 
 * The problem is to find the length of the longest contiguous subarray in a binary array that 
 * contains an equal number of 0's and 1's. 
 * The solution uses a running sum to track the balance between 0's and 1's as we go through the array. 
 * A HashMap stores the first index where each running sum occurs, and when the same sum appears again, 
 * it means we've found a subarray with equal numbers of 0's and 1's.
 */ 
class Solution {
    public int findMaxLength(int[] nums) {
        //if the input array is null, empty, or has only one element, return 0
        if(nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }

        // Variable to store the maximum length of subarray with equal 0's and 1's
        int max = 0;

        // HashMap to store the first occurrence of each running sum
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;

        // Initialize map with rSum 0 at index -1 to handle the case when a valid subarray starts from index 0
        map.put(0,-1);

        // Loop through the input array to process each element
        for(int i = 0; i < nums.length; i++) {

            // If the element is 0, decrease the rSum
            if(nums[i] == 0) {
                rSum--;
            // If the element is 1, increase the running sum (rSum)
            } else if(nums[i] == 1) {
                rSum++;

            // If this running sum has been encountered before, calculate the subarray length   
            } if(map.containsKey(rSum)) {

                // The subarray length is the difference between the current index and the first index where rSum was seen
                max = Math.max(max, (i - map.get(rSum)));
            } else {

                // If this is the first time encountering this running sum, store the index in the map
                map.put(rSum, i);
            }
        }
        // Return the maximum length of the subarray
        return max;
    }
}