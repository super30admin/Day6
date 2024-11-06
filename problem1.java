//(https://leetcode.com/problems/subarray-sum-equals-k/)
// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
import java.util.HashMap;

public class problem1 {
    public int subArraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int rSum = 0;

        map.put(0,1);
        for (int num: nums)
        {
            rSum+=num;
            int cmp= rSum-k;
            if (map.containsKey(cmp))
            {
                count += map.get(cmp);
            }
            map.put(cmp, map.getOrDefault(cmp, 0) + 1);
        }
        return count;
    }
}
