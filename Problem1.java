// Time Complexity: O(n)
// Space Complexity: O(n)

// Approach: I will use a hashmap to store the sum of the subarray and the number of times it has occurred. I will iterate through the array and calculate the sum of the subarray. If the sum-k is present in the map, I will increment the count by the value of the sum-k in the map. I will also update the map with the sum and the number of times it has occurred. Finally, I will return the count.

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int sum = 0, count = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return count;
    }
}
