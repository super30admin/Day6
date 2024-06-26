/*
TC --> O(n)
SC --> O(n)
 */
import java.util.*;

class Solution {

    public int findMaxLength(int[] nums) {
        /*
        make use of x = y+z
        x is the prefix sum at that time
        y is prefix sum that is occured before and stored in hashmap
        so z = x-y and if x=y z=0; and to have equal number of 0's and 1's we need this 
        when we encounter 0 we add -1 and otherwise add 1
         */

        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum_val = 0;
        int max_len = 0;
        mp.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum_val -= 1;
            } else {
                sum_val += 1;
            }
            if (mp.containsKey(sum_val)) {

                max_len = Math.max(max_len, i - mp.get(sum_val));

            } else {
                mp.put(sum_val, i);
            }
        }//for

        return max_len;

    }
}
