//time o(n) where n is the length of the array
//space o(1) map will have fixed size

import java.util.*;

public class sumSubArrayK {
    public int subarraySum(int[] nums, int k) {
        if (nums.length <= 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int rSum = 0, count = 0;
        map.put(rSum, 1);
        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            if (map.containsKey(rSum - k))
                count += map.get(rSum - k);
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);

        }
        return count;
    }
}
