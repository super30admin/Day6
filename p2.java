class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            Integer prev = map.get(sum);
            if (prev != null) {
                maxLen = Math.max(maxLen, i - prev);
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}