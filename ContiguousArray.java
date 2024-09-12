import java.util.*;

public class ContiguousArray {
    public int contiguousArray(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();

        int maxL = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum++;
            }
            if (!h.containsKey(sum)) {
                h.put(sum, i);
            } else {
                maxL = Math.max(maxL, i - h.get(sum));
            }
        }
        return maxL;
    }
}
