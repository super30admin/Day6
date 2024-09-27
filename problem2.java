// Time & Sapce compelxity: O(N)

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                sum++;
            else
                sum--;
            // it balances the sum, till this point so record this length
            if (sum == 0) {
                max = i + 1;
            }

            // map doesn't have already this sum with prev occured index
            if (!map.containsKey(sum))
                map.put(sum, i);
            else
                max = Math.max(max, i - map.get(sum));// if map has then find diff between currIndex-prevIndex
        }

        return max;
    }
}