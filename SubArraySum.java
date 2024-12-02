//TC and SC : O(N)
class Solution {
    public int subarraySum(int[] nums, int k) {
        int rSum =0;
        int result =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            rSum += nums[i];

            if(hm.containsKey(rSum-k))
                result+=hm.get(rSum-k);

            if(hm.containsKey(rSum))
            {
                hm.put(rSum,hm.get(rSum)+1);
            }
            else
                hm.put(rSum,1);
        }
        return result;

    }
}