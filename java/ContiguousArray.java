/* Problem : 525. Contiguous Array
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
Example 1:
Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

Example 2:
Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
*/

// Time Complexity : O(N)
// Space Complexity : O(N) as we are storing indices
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* Running Sum Pattern
calculate running sum(rSum) by doing a -1 if zero encounters or else add 1 to rSum if one encounters
Insert into map with unique rSum as key and its indices as value,
if key exists then update the maxlength by checking the existing value and i-map's value
maxlen which contain the result
*/

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxlen = 0, rSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            //calculate running sum
            rSum = nums[i] == 0 ? rSum - 1 : rSum + 1;
            //check if running sum is present in map or not
            if (!map.containsKey(rSum)) {
                map.put(rSum, i);
            } else {
                //maxlen <> existing value
                maxlen = Math.max(maxlen, i - map.get(rSum));
            }
        }
        return maxlen;
    }
}