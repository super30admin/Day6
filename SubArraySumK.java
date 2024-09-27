// Time complexity : O(N) when N = length of the array
// Space complexity: O(N) where N = legnth of array
class Solution {
    public int subarraySum(int[] nums, int k) {
        // base case
        if (nums == null || nums.length == 0) return 0;

        int rSum = 0;
        HashMap<Integer, Integer> iMap = new HashMap<>();
        iMap.put(0,1);
        int counter = 0;

        for (int i : nums) {
            rSum += i;
            if (iMap.containsKey(rSum-k)) {
                counter = counter + iMap.get(rSum-k);
            }

            if (iMap.containsKey(rSum)) {
                iMap.put(rSum,iMap.get(rSum) + 1);
            } else {
                iMap.put(rSum, 1);
            }

        }
        return counter;
    }
}