import java.util.HashMap;

class Solution {

    /*
     * Time - O(n) where n is the length of the array
     * Space - O(n)
     * 
     * Approach - Take a running sum, add 1 for 1s and -1 for 0s
     * If map does not contain the current rsum, add to it.
     * Else, length of balanced array is index-map.get(rsum)
     */
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int rsum = 0;
        int maxLength = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) rsum--;
            else rsum++;
            if (!map.containsKey(rsum)) 
                map.put(rsum, i);
            else {
                int length = i - map.get(rsum);
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}