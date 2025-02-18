// Time Complexity :o(n)
// Space Complexity :o(n) 
// Did this code successfully run on Leetcode : it runs good in leat code
// Any problem you faced while coding this : no

class Solution {
    public int findMaxLength(int[] nums) {
        int rSum=0;
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i = 0;i<n;i++){
            if(nums[i]==0){
                rSum--;
            }else{
                rSum++;
            }
            if(map.containsKey(rSum)){
                ans=Math.max(ans,i-map.get(rSum));
            }else{
                map.put(rSum,i);
            }
        }
        return ans;
    }
}