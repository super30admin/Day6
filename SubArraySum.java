// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO

// Your code here along with comments explaining your approach

import java.util.HashMap;

public class SubArraySum {

    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0 && nums == null) return 0;
        int count = 0;
        int rSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            rSum = rSum + nums[i];
            if (hm.containsKey(rSum - k)) {
                count = count + hm.get(rSum - k);
            }
            hm.put(rSum, hm.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubArraySum obj = new SubArraySum();
        int nums[] = { 2, 3, 4, 1 };
        int k = 4;
        System.out.println(obj.subarraySum(nums, k));
    }
}
