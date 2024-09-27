// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

import java.util.*;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        int count = 0;
        int sum = 0;
        // 1
        // Consider a HashMap to map the sum of the array values to the occurences of
        // the sum values in the array
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // 2
            // If the map ontains the value sum-k then we add the value of that to the count
            // variable
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // 3
            // If we have encountered with the sum value in the array then we increase
            // the no of occurences of the sum in the hashmap
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return count;
    }

    public static void main(String args[]) {
        SubarraySumEqualsK obj = new SubarraySumEqualsK();
        int nums[] = { 1, -1, 1, 3, -3, 2, 1 };
        int k = 3;
        System.out.println(obj.subarraySum(nums, k));

    }

}