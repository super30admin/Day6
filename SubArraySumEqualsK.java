// Time Complexity: O(n) where n is length of input array
// Space Complexity: O(n)
// Solved in leetcode: Yes
// Problems occured : No
import java.util.HashMap;

public class SubArraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // rSum: frequency
        int count = 0;
        int rSum = 0;
        map.put(0, 1); // To handle cases where rSum itself equals k

        for (int num : nums) {
            rSum += num;
            int comp = rSum - k;
            if (map.containsKey(comp)) {
                count += map.get(comp);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubArraySumEqualsK solver = new SubArraySumEqualsK();

        // Example 1
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("Example 1 Output: " + solver.subarraySum(nums1, k1)); // Output: 2

        // Example 2
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println("Example 2 Output: " + solver.subarraySum(nums2, k2)); // Output: 2
    }
}
