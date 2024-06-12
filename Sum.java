import java.util.HashMap;

public class Sum {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int rsum = 0;
        int count = 0;
        HashMap<Integer, Integer> sum = new HashMap<>();
        sum.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            rsum = rsum + nums[i];
            if (sum.containsKey(rsum - k)) {
                count += sum.get(rsum - k);
            }
            sum.put(rsum, sum.getOrDefault(rsum, 0) + 1);
        }
        return count;
    }
}
