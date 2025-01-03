import java.util.HashMap;

/**
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 * Ran on leetcode?: Yes
 * Any problems faced?: No
 */
public class SubarraySumEqualsK {
    /**
     * Utilizing the running sum method where for the sum is calculated using value at each index
     * and if the running sum - expected sum is seen in hashmap, its frequency is noted
     */
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 1 && k == 1)
            return 1;
        int count = 0;
        int rSum = 0;
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        frequencyMap.put(0, 1);

        for (int n : nums) {
            rSum += n;
            int key = rSum - k;
            if (frequencyMap.containsKey(key)) {
                count += frequencyMap.get(key);
            }
            frequencyMap.put(rSum, frequencyMap.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK obj = new SubarraySumEqualsK();
        int[] arr = {-1,2,4,1,5,2,6};
        int sum = obj.subarraySum(arr, 5);
        System.out.println("Sum: " + sum);
    }
}
