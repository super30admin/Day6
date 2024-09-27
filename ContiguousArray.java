class Solution {
    public int findMaxLength(int[] nums) {
        // Initializing current sum and maxLen to 0
        int currSum = 0;
        int maxLen = 0;
        // declare hashmap to store current sum and its starting index
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // add current sum, 0 and assume its index to be -1
        hashMap.put(0, -1);

        // Loop through the array
        for (int x = 0; x < nums.length; x++) {
            // if num[x] is 0 the add one to current sum else substract 1 from current sum
            if (nums[x] == 0) {
                currSum += 1;
            } else {
                currSum -= 1;
            }

            // if the value already exists in the map update the MaxLen value
            // else add current sum and its start index to the hashmap
            if (hashMap.containsKey(currSum)) {
                maxLen = Math.max(maxLen, x - hashMap.get(currSum));
            } else {
                hashMap.put(currSum, x);
            }
        }
        // return maxLen
        return maxLen;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
