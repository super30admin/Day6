// Time & Sapce compelxity: O(N)
class Solution {
    public int subarraySum(int[] nums, int k) {

        // stores <sum,countOf subArrays with given sum>
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int sum = 0;

        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int complement = sum - k;

            // if map has complement sum occured already
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}