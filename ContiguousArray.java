import java.util.HashMap;

public class ContiguousArray {

        public int findMaxLength(int[] nums) {
            // HashMap to store first occurrence of each cumulative sum
            HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
            sumIndexMap.put(0, -1); // Base case: sum 0 at index -1

            int maxLength = 0;
            int cumulativeSum = 0;

            for (int i = 0; i < nums.length; i++) {
                // Convert 0 to -1
                cumulativeSum += (nums[i] == 0) ? -1 : 1;

                // If this sum has been seen before, update maxLength
                if (sumIndexMap.containsKey(cumulativeSum)) {
                    maxLength = Math.max(maxLength, i - sumIndexMap.get(cumulativeSum));
                } else {
                    // Store the first occurrence of this sum
                    sumIndexMap.put(cumulativeSum, i);
                }
            }

            return maxLength;
        }
    }

