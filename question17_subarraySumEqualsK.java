package Hashing2;

import java.util.HashMap;

public class question17_subarraySumEqualsK {

    /*
    Using 1 HashSet ---->
        Time Complexity : O(n)
        Space Complexity: O(n) // It is because we check the map using containsKey and it traverses the map.
     */

    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int runSum = 0;
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++) {
            runSum += nums[i];
            if(map.containsKey(runSum - k)) {
                count += map.get(runSum - k);
            }
            map.put(runSum, map.getOrDefault(runSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
