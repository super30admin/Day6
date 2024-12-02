// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

public class Problem1 {

    public static int subarraySum(int[] nums, int k) { // brute force
        if(nums.length == 1)    return k == nums[0] ? 1 : 0;

        int cur_sum = 0, count = 0;
        HashMap<Integer, Integer> mapping = new HashMap<>();
        mapping.put(0, 1);

        for (int i : nums) {
            cur_sum += i;
            int diff = cur_sum - k;
            if(mapping.containsKey(diff))   count += mapping.get(diff);
            if(mapping.containsKey(cur_sum))    mapping.put(cur_sum, mapping.get(cur_sum) + 1);
            else mapping.put(cur_sum, 1);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2)); // 2
        System.out.println(subarraySum(new int[]{-1, -1, 1}, 1)); // 1
        System.out.println(subarraySum(new int[]{1, -1, 0}, 0)); // 3
    }
}
