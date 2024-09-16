// Time complexity is O(n) and space comlexity is O(n)
class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int ps = 0, maxLength = 0, minIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            ps += nums[i] == 0 ? -1 : 1;

            if (map.containsKey(ps)) {
                int len = i - map.get(ps);
                maxLength = Math.max(maxLength, len);
            } else {
                map.put(ps, i);
            }
        }
        return maxLength;
    }
}