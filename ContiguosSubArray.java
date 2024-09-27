// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

import java.util.*;

class ContiguosSubArray {
    public int findMaxLength(int[] nums) {
        int sum = 0, maxLength = 0;
        // 1
        // Consider a HashMap that maps the sum of the array weights and the index
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            // 2
            // Give weight of 1 to the value 1 and -1 to the value 0
            // If you encounter 1 then add 1 to the sum and if you encounter 0 subtract 1 to
            // the sum
            if (nums[i] == 1)
                sum += 1;
            else
                sum += -1;

            // 3
            // If the map contains sum then compare the length and the (current index - sum)
            // value which is mapped in the HashMap
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            }
            // If there is no key then just put the index in the map
            else {
                map.put(sum, i);
            }
        }

        return maxLength;

    }

    public static void main(String args[]) {
        ContiguosSubArray obj = new ContiguosSubArray();
        int arr[] = { 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1 };
        int maxi = obj.findMaxLength(arr);
        System.out.println("max length = " + maxi);

    }
}