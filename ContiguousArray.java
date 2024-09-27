import java.util.HashMap;

/*
https://leetcode.com/problems/contiguous-array/
Time: O(N)
Space: O(N)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int maxLength = 0;
        map.put(0, -1); // to handle special case [0,1]

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count--;

            else
                count++;

            if (map.containsKey(count))
                maxLength = Math.max(maxLength, i - map.get(count));
            // startIndex = map.get(count) and endIndex = i

            else
                map.put(count, i);
        }

        return maxLength;
    }

}
