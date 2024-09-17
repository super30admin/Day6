// Time Complexity : O(n)
// Space Complexity : O(n)

import java.util.*;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int rSum = 0;
        int max = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                rSum++;
            } else {
                rSum--;
            }
            if (map.containsKey(rSum)) {
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0 };
        ContiguousArray ca = new ContiguousArray();
        System.out.println(ca.findMaxLength(nums));
    }
}
