/*
TC --> O(n)
SC --. O(n)
 */
import java.util.*;

class Solution {

    public int subarraySum(int[] nums, int k) {
        /*
        We use the same concept of x = y+z
        x = prefix sum
        z = 7
        y =  x-7
         */

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int diff;
        int sum_val = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum_val += nums[i];
            diff = sum_val - k;
            if (mp.containsKey(diff)) {
                count += mp.get(diff);

            }
            mp.put(sum_val, mp.getOrDefault(sum_val, 0) + 1);

        }//for

        return count;

    }
}
