package Hashing2;

import java.util.HashMap;

public class question18_contiguousArray {

    /*
        Using HashMap --->
            Time Complexity: O(n)
            Space Complexity: O(n) // I don't know if it's correct?
     */

    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int runSum = 0;
        int max = 0;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == 0)
                runSum--;
            else if(nums[i] == 1)
                runSum++;

            if(map.containsKey(runSum)) {
                int curr = i - map.get(runSum);
                max = Math.max(max, curr);
            } else {
                map.put(runSum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
