// Time Complexity: O(n) where n is length of nums
// Space Complexity: O(n)
// Solved in leetcode: Yes
// Problems occured : No
import java.util.HashMap;

public class FindMaxLength {

    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); // rSum: index
        int rSum = 0;
        int length = 0;
        map.put(0, -1); // To handle the case when the subarray starts from index 0

        for (int i = 0; i < nums.length; i++) {
            // Update running sum based on current element
            if (nums[i] == 0) rSum--;
            else rSum++;

            // Check if this rSum has been seen before
            if (map.containsKey(rSum)) {
                length = Math.max(length, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        FindMaxLength solver = new FindMaxLength();

        // Example 1
        int[] nums1 = {0, 1};
        System.out.println("Example 1 Output: " + solver.findMaxLength(nums1)); // Output: 2

        // Example 2
        int[] nums2 = {0, 1, 0};
        System.out.println("Example 2 Output: " + solver.findMaxLength(nums2)); // Output: 2
    }
}
