/* Problem:
* 560. Subarray Sum Equals K
* Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
* Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

* Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 */

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* check the rSum at each point and check if the rSum - K exists as key in the map.
if exists increment the counter with the frequency of that key's value present in the map
Keep updating the rSum and its frequency in the map
return the count
* */
class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        //key is rsum and value is frequency
        //base case
        map.put(0, 1);
        int rSum = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            //calculate running sum
            rSum = rSum + nums[i];
            //check if map contains key
            if (map.containsKey(rSum - k)) {
                count = count + map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }
}