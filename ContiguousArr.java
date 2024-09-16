// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/*
    If arr element is 1, we increment count by 1, else we decrement count by -1.
    If map contains count, we calculate the max length by taking max of maxlen and i-valueof count.
    At the end, we return maxlen.
*/
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
                System.out.println(maxlen);
            } else {
                map.put(count, i);
                System.out.println(map);
            }
        }
        return maxlen;
        
    }
}