/*
Time Complexity: O(n) going over all elements in array
Space Complexity: O(n) we are storing the running sum

Did this code successfully run on Leetcode: Yes

Brute Force approach: Try to find every sub array and then go over every sub array to see if the addition is equal to
target, if it is the target increment the count, TC: O(n^3) same as explained in contiguous array question, O(n^2) to form
the sub array, O(n) to check the sum so O(n^3) because of nested iterations

So if we have nested iterations, we can explore running sum patterns, two pointers, sliding window, Dynamic programming, here
we are using running sum pattern to optimize basically remove the nested iterations.

eg:               [3, 4, 7, 2]
Running Sum =>  0, 3, 7, 14, 16 {rSum + current element}
Index=>         1, 2, 3, 4, 5
 */

import java.util.HashMap;

class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>(); //rSum : freq

        int count = 0; // to find total no of sub arrays
        int rSum = 0;

        map.put(0, 1); //EDGE CASE

        for(int num : nums) {

            rSum += num;
            int complement = rSum - k;

            if(map.containsKey(complement)) {
                count += map.get(complement); //map.get(complement) will give freq
            }

            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }

        return count;
    }
}