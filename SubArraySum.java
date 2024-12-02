// Technique: Using Hashmap. 
// Hint: Get the sums array and then use the sums as keys and check if sum - k key is present in the hashmap.

// TIME: O(n);
// SPACE: O(n);
// SUCCESS on LeetCode

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        
        countMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (countMap.containsKey(sum - k)) {
                count += countMap.get(sum-k);
            }
            countMap.put(sum, countMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}