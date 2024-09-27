//Time Complexity = O(n)
//Space Complexity = O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        //Here map contains <rolling-sum, index>
        Map<Integer, Integer> map = new HashMap<>();
        int max=0, rSum=0;

        //Initialize map with <0, -1>, for the case such as [0,1]
        map.put(0, -1);

        for (int i=0; i<nums.length; i++) {
            // If we find a 0, we decrement the rolling sum by 1 and if we get a 1 we increment it
            if (nums[i] == 0) {
                rSum--;
            }
            else {
                rSum++;
            }

            // If map doesnt contain the current rolling sum, we add it with the first index where it occured, otherwise we get the index from map and subtract it from the current occurance, and update the max variable if needed.
            if (!map.containsKey(rSum)) {
                map.put(rSum, i);
            }
            else {
                int firstIdx = map.get(rSum);
                max = Math.max(max, i-firstIdx);
            }
        }
        return max;
    }
}