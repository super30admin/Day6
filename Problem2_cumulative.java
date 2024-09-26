//Problem: 560. 205. Isomorphic Strings
/** 3 Pointer Approcach: 
 * Used 2 loops to iterate over all possible subarrays.
 */ 
//
//time Complexity :
// O(N^2)

// Space Complexity :
// O(1)

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

public class Problem2_cumulative {
    public int findMaxLength(int[] nums) {

        int max = 0;
        Map<Integer, Integer> map = new HashMap();
        int cumulative = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            cumulative += nums[i] == 0 ? -1 : 1;

            if (map.containsKey(cumulative)) {
                int index = map.get(cumulative);
                max = Math.max(i - index, max);
            } else {
                map.put(cumulative, i);
            }

        }

        return max;

    }
}