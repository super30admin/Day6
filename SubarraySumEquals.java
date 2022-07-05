// Time complexity 0(n)
// Space Complexity 0(n
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0 || nums==null)
            return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int rsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            rsum=rsum+nums[i];
            if(map.containsKey(rsum-k))
            {
                count=count+map.get(rsum-k);
            }
            if(map.containsKey(rsum))
            {
                map.put(rsum,map.get(rsum)+1);
            }
            else
            {
                map.put(rsum,1);
            }
        }
        return count;
    }
}