
/*
Time Complexity : O(n) here n is the length of the array. we traverse array only one time.
Space Compelxity: O(n) here using auxilary ds hashmap which store the at max size of n elements if no subarray has equal to k.

*/
import java.util.*;

public class Solution_subarray {

    public int subarraySum(int[] nums, int k) {

        // count will return how many subarray sum has equal to k.
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        // putting hashmap (0,1) beacause if first element has value equal to k.

        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            // adding each element
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                // checking how many time that element has appear in array and incremented count
                // as per values of that integer.
                count += map.get(sum - k);
            }

            // checking if element exist in the map then get else put value of that element.
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return count;
    }

}
