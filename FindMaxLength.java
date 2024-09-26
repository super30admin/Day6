/**
 * Time Complexity - O(n) - n elements
 * Space Complexity - O(n) - n elements
 */

class FindMaxLength {
    public int findMaxLength(int[] nums) {
        //Map for storing intermediate 0's and 1's values
        Map<Integer, Integer> map = new HashMap();
        int count = 0, maxLen = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLen;
    }
}