// Time Complexity : O(n)
// Space Complexity : O(n)

import java.util.*;

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int rSum = 0;
        map.put(rSum, 1);

        for (int i = 0; i < nums.length; i++) {
            rSum = rSum + nums[i];
            if (map.containsKey(rSum - k)) {
                count = count + map.get(rSum - k);
            }

            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        int k = 3;
        SubArraySum sas = new SubArraySum();
        System.out.println(sas.subarraySum(nums, k));
    }
}
