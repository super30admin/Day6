/*
    Leetcode problem 525: Contiguous Array
    T.C: O(n) :: S.C: O(n)

    Solved using running sum pattern (i.e z = x - y, where z is the difference
    between current rSum and the index at which you intend to find your target sum)
    For this problem if rSum - HashMap.get(rSum) == 0 then a balanced number of
    contiguous 0s and 1s exist in the subArray
*/

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int resultLen = 0;
        int rSum = 0;
        HashMap<Integer, Integer> rSumIndexMap = new HashMap<>();
        
        rSumIndexMap.put(rSum, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rSum--;                
            } else {
                rSum++; 
            }

            rSumIndexMap.putIfAbsent(rSum, i);

            if (rSumIndexMap.containsKey(rSum)){
                //keep an eye on the operations to be performed to get the desired result
                resultLen = Math.max(resultLen, i - rSumIndexMap.get(rSum));
            }
        }

        return resultLen;
    }
}