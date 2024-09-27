// Time Complexity : O(n); n = len of array
// Space Complexity : O(n); n = no of key-values in hashmap
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class ContiguousBinaryArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, max = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end] == 1 ? -1 : 1;

            if (map.containsKey(sum)) {
                int start = map.get(sum);
                max = Math.max(max, end - start);
            }
            else {
                map.put(sum, end);
            }
        }
        return max;
    }
}