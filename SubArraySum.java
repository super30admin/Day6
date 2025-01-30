// Time Complexity : O(n) where n is the length of the input array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Using a running sum (rSum) and using a HashMap to track the frequency of each sum,
// then counting how many times the difference rSum - k has occurred.

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int rSum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            if (map.containsKey(rSum - k)) {
                result += map.get(rSum - k);
            }

            if (!map.containsKey(rSum)) {
                map.put(rSum, 1);
            } else {
                map.put(rSum, map.get(rSum) + 1);
            }
        }
        return result;
    }
}
