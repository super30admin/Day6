
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


class Solution {
    public int findMaxLength(int[] nums) {  
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0;
        int rsum=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0) rsum-=1;
            else rsum+=1;
            if(map.containsKey(rsum)) max = Math.max(max, i-map.get(rsum));
            else map.put(rsum,i);
        }
        return max;
    }
}
    
