// Time Complexity : O(n) where n is the length of the input array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Using a running sum (rSum) and a HashMap to track the first occurrence of each sum,
// and calculating the maximum length when the sum repeats.

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int rSum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rSum--;
            } else {
                rSum++;
            }

            if (map.containsKey(rSum)) {
                result = Math.max(result, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return result;
    }
}
