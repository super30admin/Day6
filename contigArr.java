// TC: O(n)
// SC: O(n)
// Solved on Leetcode
// No problems faced
class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int rSum = 0;
        int len = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                rSum += 1;
            } else {
                rSum -= 1;
            }
            if (map.containsKey(rSum)) {
                len = Math.max(len, i - map.get(rSum));        
            } else {
                map.put(rSum, i);
            }
        }
        return len;
    }
}
