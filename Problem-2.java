// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Understanding the logic


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(0,-1);
        int currsum = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                currsum += -1;
            }
            else {
                currsum += 1;
            }
            if(map.containsKey(currsum)) {
                max = Math.max(max,i-map.get(currsum));
            }
            else {
                map.put(currsum,i);
            }
        }
        return max;
    }
}