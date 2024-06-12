import java.util.HashMap;

public class Palindrome {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> len = new HashMap<>(); // rsum:idx
        len.put(0, -1);
        int max = 0;
        int rSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rSum = rSum - 1;
            } else {
                rSum = rSum + 1;
            }
            if (len.containsKey(rSum)) {
                max = Math.max(max, i - len.get(rSum));
            } else {
                len.put(rSum, i);
            }
        }
        return max;
    }
}
