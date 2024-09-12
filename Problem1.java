class Solution {
    // Time O(n), Space O(n)
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;

        // Running sum approach

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);// Initial case for first element

        int rSum = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];

            if (map.containsKey(rSum - k)) {// Check if our rSum - target exists in map.
                // k = rSum - b
                counter += map.get(rSum - k); // If yes, increment counter by value found in map
            }
            if (map.containsKey(rSum)) { // if not, if rSum exists, increment value
                map.put(rSum, map.get(rSum) + 1);
            } else {
                map.put(rSum, 1);// otherwise put rSum in map.
            }
            // Above if else can be avoided by
            // map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return counter;
    }
}