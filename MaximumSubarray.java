// Time complexity : O(n)O(n). The entire numsnums array is traversed only once.

// Space complexity : O(n)O(n). Hashmap mapmap can contain up to nn distinct entries in the worst case.

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        map.put(0, 1);

        for (Integer i : nums) {
            sum += i;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;

    }
}