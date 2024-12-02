/**
 * 
 * Idea here is similar to the previous problem, where we had to find the number
 * of continuous sub-arrays where sum equals k. Here also we use a hashmap for
 * quick lookup of a sum that occurs while iterating the array. 
 * As we are interested to find out the length of longest such sub array, we would store
 * the first instance where we encounter a 'sum'. Using the index stored with
 * the sum, we can determine the length easily.
 * 
 * Space Complexity: O(n) 
 * Time Complexity: O(n)
 * 
 * Leetcode Result: Runtime: 29 ms, faster than 64.85% of Java online
 * submissions for Contiguous Array. 
 * Memory Usage: 51.3 MB, less than 100.00% of
 * Java online submissions for Contiguous Array.
 */
class ContiguousArray {

    /**
     * Given a binary array, find the maximum length of a contiguous subarray with
     * equal number of 0 and 1.
     * 
     * @param nums
     * @return max length of a contiguous subarray with equal 0 and 1.
     */
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (count == 0) {
                maxlen = i + 1;
            }
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
