/**
  Time Complexity: O(N)
  Space Complexity: O(N)
**/

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> rSumMap = new HashMap<Integer, Integer>();
        rSumMap.put(0, 1);
        int rSum =0;
        int count = 0;

        for(int i=0; i< nums.length; i++) {
            rSum += nums[i];
            int y = rSum - k;
            if(rSumMap.containsKey(y)) {
                count += rSumMap.get(y);
            }
            

             if(!rSumMap.containsKey(rSum)) {
                rSumMap.put(rSum, 1 );
             } else {
                rSumMap.put(rSum, rSumMap.get(rSum) + 1 );
             }


        }
        return count;
    }
}
