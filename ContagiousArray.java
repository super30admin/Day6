// Time complexity : O(n)O(n). The entire array is traversed only once.

// Space complexity : O(n)O(n). Maximum size of the HashMap mapmap will be \text{n}n, if all the elements are either 1 or 0.

class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 0 ? -1 : 1);
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLength;
    }
}