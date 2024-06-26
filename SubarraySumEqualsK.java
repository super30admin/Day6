/*
    1. Time Complexity : O(n)
    2. Space Complexity : O(n)   
    3. Did this code successfully run on Leetcode : Yes
    4. Any problem you faced while coding this : -
 */

/*
 * Calculated sum at each index. Check if (sum - target) already present in HashMap
 * if yes, add that occurances count to result and then increment the occurance of sum in the hashmap
 */
import java.util.HashMap;
class Solution {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; ++i) {
            sum+=nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {-4, 1, -3, 2, 1, 0, 3, -6};
        int k = -3;
        System.out.println("Total no of subarray with sum " + k + " is: " + subarraySum(nums, k));
    }
}