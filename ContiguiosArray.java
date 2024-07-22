/**
  TimeComplexity: O(N)
  SpaceComplexity: O(N)
**/

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> rSumMap = new HashMap<>();
        rSumMap.put(0, -1);
        int rSum = 0;
        int maxSubArr = 0;
        for(int i=0; i< nums.length; i++) {
                if(nums[i] == 0) {
                    rSum--;
                } else {
                    rSum++;
                }
                if(rSumMap.containsKey(rSum)) {
                    maxSubArr = Math.max(maxSubArr, i - rSumMap.get(rSum) );
                } else {
                    rSumMap.put(rSum, i);
                }

        }
        return maxSubArr;
    }
}
