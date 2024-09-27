// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) sum--;
            else sum++;
            if(map.containsKey(sum)){
                len = Math.max(len,  i - map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return len;
    }
}
