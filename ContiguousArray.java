import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0, one = 0;
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero += 1;
            else
                one += 1;

            if (!map.containsKey(one - zero))
                map.put(one - zero, i);

            if (one == zero)
                res = one + zero;
            else {
                int idx = map.get(one - zero);
                res = Math.max(res, i - idx);
            }

        }
        return res;
    }
}