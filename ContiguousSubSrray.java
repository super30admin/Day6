class Solution {
    /**
     *  Running some pattern
     *  0 -> substract 1. 1 -> add 1
     *  Keep runing sum in hashmap. If we encountred same sum then diff between those indexes will be zero and so they are balanced.
     *  Time: O(n)
     *  Space: O(n)
     */

    public int findMaxLength(int[] nums) {
        int rSum = 0;
        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            if (nums[i] == 0) {
                rSum++;
            } else {
                rSum--;
            }

            if (map.containsKey(rSum)) {
                int firstIndex = map.get(rSum);
                max = i - firstIndex;
                result = Math.max(result, max);
            } else {
                map.put(rSum, i);
            }
        }
        return result;
    }
}
