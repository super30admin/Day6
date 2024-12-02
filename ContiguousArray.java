// Time Complexity :O(n) 
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public int findMaxLength(int[] nums) {
        int rsum=0;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) rsum--;
            else rsum++;
            if(map.containsKey(rsum)){
                max=Math.max(max,i-map.get(rsum));
            }
            else{
                map.put(rsum,i);
            }
        }
        return max;
    
    }
   
}