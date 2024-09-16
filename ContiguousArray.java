import java.util.HashMap;
import java.util.Map;

// Time complexity: O(n)
// Space complexity: O(1)
public class ContiguousArray {

    // Pattern to remember - running sum
    // Follow-up question - Give the entire subarray which has contiguous array of 1 & 0
        // Possible solution - whenever we switch the max value maintain start and end position as well.
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int count = 0;
        int max = 0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1); // this will handle [1,0] or [0,1]
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == 1) count += 1;
            else count -= 1;

            // Put the count value in a map
            // key -> count    value -> index at which we saw this count value
            // The reason for (i - map.get(count)) - It means somewhere we had a similar rSum and if we are getting the same rSum again
                // that means we came across similar number of 0s and 1s after the last position where we saw that
            if(map.containsKey(count)) max = Math.max(max, i - map.get(count));

            // If the count value doesn't exist in the map then only put it in the map
            // So, we are maintaining the farthest position.
                // It means even though we see the similar count again, we are just maintaining the position where we first time found this count.
                // This gives us the longest sub array
            else map.put(count,i);
        }

        return max;
    }
}
