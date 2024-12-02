// Technique: Using Hashmaps. 
// Hint: Convert all 0s to -1s and then find the longest subarray of sum 0.

// TIME: O(n)
// SPACE: O(n);
// SUCCESS on LeetCode

public class LargestEqualZerosOnes {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        
        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0; 
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            if (sum == 0) {
                count = i + 1;
                continue;
            } else if (sumMap.containsKey(sum)) {
                int start = sumMap.get(sum);
                count = Math.max(count, i - start);
                continue;
            }
            sumMap.put(sum, i);
        }
        
        return count;
    }
}
