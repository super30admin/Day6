// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1); // Base case to consider subarrays starting from index 0
        int rsum = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) rsum++;
            else rsum--;
            if(!map.containsKey(rsum)){
                map.put(rsum,i);
            }else{
                max=Math.max(max,i-map.get(rsum));
            }
        }
        return max;
    }
}