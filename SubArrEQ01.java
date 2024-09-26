package Day7;

import java.util.HashMap;

public class SubArrEQ01 {

    public int findMaxLength(int[] nums) {

        //Edge case
        if (nums == null || nums.length <= 1) return 0;

        int max = 0;
        int rSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            rSum = nums[i] == 0 ? rSum - 1 : rSum + 1;
            if (!map.containsKey(rSum)) {
                map.put(rSum, i);
            } else {
                //you calculate length and update max only if len is greater than max
                max = Math.max(max, i - map.get(rSum));
            }
        }

        return max;
    }

    public static void main(String args[]) {
        SubArrEQ01 ob = new SubArrEQ01();

        int[] nums = new int[]{0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0};

        System.out.println("Maximum length of the contiguous sub array with equal number of 0s and 1s is "+ ob.findMaxLength(nums));

    }
}
