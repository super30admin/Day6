// Time complexity : O(N) when N = length of the array
// Space complexity: O(N) where N == legnth of array of all the elements are unique in this case
class Solution {
    public int findMaxLength(int[] nums) {

        // base case
        if (nums == null || nums.length == 0) return 0;

        // Map stores the rsum and its index
        HashMap<Integer, Integer> theMap = new HashMap<>();
        // Handle the base case for running sum and its index before
        // start of array == -1
        theMap.put(0,-1);
        int rSum = 0;
        int len = 0; // base length

        for (int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                rSum += 1;
            } else {
                rSum -= 1;
            }
            if(theMap.containsKey(rSum)) {
                if (i - theMap.get(rSum) > len) len = i - theMap.get(rSum);
            } else {
                theMap.put(rSum, i);
            }
        }

        return len;
    }
}