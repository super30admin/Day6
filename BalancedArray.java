class Solution {
    public int findMaxLength(int[] nums) {
        int rSum = 0;
        int n = nums.length;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                rSum--;
            } else {
                rSum++;
            }
            if (map.containsKey(rSum)) {
                result = Math.max(result, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }

        }
        return result;
    }
}