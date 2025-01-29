import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

public class Problem2 {

    public static void main(String[] args) {

//        int[] nums = {0, 1};
//        int[] nums = {0, 1, 0};
//        int[] nums = {0, 1, 0, 1};
        int[] nums = {};
        System.out.println(findMaxLength(nums));
    }

    private static int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap();
        int maxLength = 0;
        int count  = 0;
        map.put(0, - 1);

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 0) {
                count--;
            } else {
                count++;
            }

            if(map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                // put just the first occurence of the key as we trying to find the max length
                map.put(count, i);
            }
        }


        return maxLength;
    }
}
