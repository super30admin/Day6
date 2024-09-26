//TC & SC : O(N)
class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0, -1);
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            // if num == 0, count + 1, num = 1, count - 1
            count = nums[i] == 0 ? count + 1 : (count - 1);
            // if count already exit in map, means encounter equal number of 0s and 1s from previous index to current index
            if (map.containsKey(count)) {
                max = Math.max(max, i - map.get(count));
            } else {
               map.put(count, i); 
            }
        }
        return max;
    }
}