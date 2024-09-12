/*
Run time complexity - O(N) - One pass loop of length of nums array
Space complexity - O(N) - To store the temporary hashmap.
*/

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        if(nums==null || nums.length==0)
            return 0;
        int rsum=-1;
        map.put(-1,-1);
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            rsum=nums[i]==0?rsum-1:rsum+1;
            if(map.containsKey(rsum))
            {
                max=Math.max(max,i-map.get(rsum));
            }
            else
            {
                map.put(rsum,i);
            }
        }
        return max;
    }
}
