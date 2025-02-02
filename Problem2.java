import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
Use a counter : when we encounter a
0 : decrement the count
1 : increment the count
make use of a map to keep track of the indices to find the largest subarray
if we encounter a count that is previously seen, the index between the current
and previously seen count is a continuous subarray
 */

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
