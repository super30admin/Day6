// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No 

import java.util.HashMap;

public class findMaxLength {

    public static int findMax(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int max = 0;
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                rSum--;
            else
                rSum++;

            if (map.containsKey(rSum)) {
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        System.out.println(findMax(arr));
    }
}
