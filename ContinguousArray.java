// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, -1);
        int maxlen = 0;
        int count = 0;
        // add +1 if 1 is found and -1 if 0 is found
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count = count + 1;
            else
                count = count - 1;
            // If count value present choose the maximum
            if (hmap.containsKey(count)) {
                maxlen = Math.max(maxlen, i - hmap.get(count));
            } else {
                hmap.put(count, i);
            }
        }
        return maxlen;
    }
}