class Solution {
    //TC: O(n)SC:O(n)
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int rSum=0;int maxLength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)rSum=rSum-1;
            else rSum=rSum+1;
            if(map.containsKey(rSum)){
                //current index i,if we got rsum=0,we find 0's value in map(which has previous subarray length)
                int currentLength=i-map.get(rSum);
                 maxLength=Math.max(maxLength,currentLength);//to update, if any new rsum=0 came up
            }
            else map.put(rSum,i);
           
        }
        return maxLength;
}}
