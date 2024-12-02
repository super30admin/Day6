// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            int temp = sum-k;
            if(map.containsKey(temp)) {
                count += map.get(temp);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}