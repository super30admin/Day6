// Keep a hashmap to have a mappaing of difference of number of one and zeros to index. 
// Traverse through the array, if the count already exists in the map, then there are equak number of one and zero last time when that count occurred and the current index. 

// Time Complexity : O(n), where n is the length of the given array
// Space Complexity : O(n)

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        int count = 0, maxlen = 0;
        Map<Integer, Integer> countToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;

            if (count == 0) {
                maxlen = i + 1;
            } else if (countToIndex.containsKey(count)) {
                maxlen = Math.max(maxlen, i - countToIndex.get(count));
            } else {
                countToIndex.put(count, 1);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1 };
        System.out.println(findMaxLength(nums));
    }
}
