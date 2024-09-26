// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach

public class ContiguosArray {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, max = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count--;
            else
                count++;

            if (map.containsKey(count)) {
                if (i - map.get(count) > max)
                    max = i - map.get(count);
            }

            else {
                map.put(count, i);
            }
        }

        return max;

    }
}
