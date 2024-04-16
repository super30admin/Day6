// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
import java.util.HashMap;
import java.util.HashSet;

public class SubarraySumLC560 {

    // Brute force Approach using nested loops
    public  int subarraySumBF(int[] nums, int k) {
        int cnt = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = nums[i];
            if (total == k)
                cnt++;
            for (int j = i + 1; j < nums.length; j++) {
                total = total + nums[j];
                if (total == k)
                    cnt++;
            }
        }
        return cnt;
    }

    // using hashmap
    public  int subarraySumMap(int[] nums, int k) {
        int count = 0;
        int runSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for (int num : nums) {
            runSum += num;

            if (runSum == k)
                count++;
            if (map.containsKey(runSum - k)) {
                count += map.get(runSum - k);
            }
            map.put(runSum, map.getOrDefault(runSum, 0) + 1);

        }
        return count;

    }

   

}
