// Time Complexity : O(n * sizeOfMap)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had a hard time coming up with an approach and had to refer a solution


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int subArrayCount = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            subArrayCount = subArrayCount + map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return subArrayCount;
    }
}