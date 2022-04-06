// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No	


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int count = 0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0)
                count--;
            else
                count++;
            if(map.containsKey(count)){
                max = Math.max(max,i-map.get(count));
            }
            else
                map.put(count,i);
        }
        return max;
    }
}