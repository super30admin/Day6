import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n) as all the elements from the array are traversed
// Space Complexity: O(n) as HashMap is used

// Using the running Sum difference and Map together to check if k sum of Sub array exists or not.
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] { 1, 1, 1 }, 2)); // 2
        System.out.println(subarraySum(new int[] { 1, 2, 3 }, 3)); // 2
    }

    public static int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return -1;
        Map<Integer, Integer> map = new HashMap<>();
        int runningSum = 0;
        map.put(0, 1); // base entry for checking convenience
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (map.containsKey(runningSum - k))
                count += map.get(runningSum - k);
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
        }
        return count;
    }
}