// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

public class Problem2 {

    public static int findMaxLength(int[] nums) {
        if(nums.length == 1)    return 0;

        int cur_sum = 0, max = 0;
        HashMap<Integer, Integer> mapping = new HashMap<>();
        mapping.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) ++cur_sum;
            else --cur_sum;

            if(mapping.containsKey(cur_sum))
                max = Math.max(max, i - mapping.get(cur_sum));
            else
                mapping.put(cur_sum, i);

        }

        return max;
    }


    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0,1})); // 2
        System.out.println(findMaxLength(new int[]{0,1,0})); // 2
        System.out.println(findMaxLength(new int[]{0,1,0,1,0,1,0,1,1})); // ?
    }
}
