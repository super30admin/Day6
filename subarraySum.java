/*
Run time complexity - O(N) - One pass loop of length of nums array
Space complexity - O(N) - To store the temporary hashmap.
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0)
            return 0;
        int len=nums.length;
        int count=0;
        int rsum=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(); // map to store the previous running sum with its count
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            rsum=rsum+nums[i];
            if(map.containsKey(rsum-k))
                count=count+map.get(rsum-k);
            map.put(rsum,map.getOrDefault(rsum,0)+1);
        }
        return count;
    }
}
