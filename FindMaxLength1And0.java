/**
 Time Complexity: O(n) where n is length of nums array
 Space complexity: O(n) where n is umber of elements in map

 Approach: So here we are using a startegy that if I find the same rolling sum in my loop again that means there were equal number of addition and subtraction and so Sum is same so we take an index and calculate length and compare it with global max
 */

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Map<Integer, Integer> countToIndex = new HashMap<>();
        countToIndex.put(0, -1);
        int result = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;

            if (countToIndex.containsKey(count)) {
                result = Math.max(result, i - countToIndex.get(count));
            } else {
                countToIndex.put(count, i);
            }
        }

        return result;
    }
}