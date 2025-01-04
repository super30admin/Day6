//TC: O(n)
//SC: O(n)
//approach: store running sum to it's count mapping in hashmap
// iteraing over array, add int to rsum, check if rsum-k exists in map,
// if yes update result count with its count from map

import java.util.HashMap;

public class SubArraySum {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> runningSumCountMap = new HashMap<>();
        runningSumCountMap.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            if (runningSumCountMap.containsKey(sum - k)) {
                count += runningSumCountMap.get(sum - k);
            }
            runningSumCountMap.put(sum, runningSumCountMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

