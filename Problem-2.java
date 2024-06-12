// Time Complexity : O(N) 
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0,maxLen=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count+=1;
            else
                count+=-1;
            
            if(map.containsKey(count)){
                maxLen=Math.max(maxLen, i-map.get(count));
            }else
            {
                map.put(count,i);
            }
            
        }
        return maxLen;
    }
}
