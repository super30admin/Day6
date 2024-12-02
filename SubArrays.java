import java.util.HashMap;

public class SubArrays {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> hs = new HashMap<>();

        hs.put(0, 1);
        int maxSubs = 0;
        int rCount = 0;
        for (int i = 0; i < nums.length; i++) {
            rCount += nums[i];
            if (hs.containsKey(rCount - k))
                maxSubs += hs.get(rCount - k);
            if (hs.containsKey(rCount))
                hs.put(rCount, hs.get(rCount) + 1);
            else
                hs.put(rCount, 1);

        }

        return maxSubs;
    }

    public static void main(String[] args) {
        SubArrays sa = new SubArrays();
        int[] nums = { 1, 1, 1 };

        System.out.println(sa.subarraySum(nums, 2));
    }
}
