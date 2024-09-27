class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int rSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0; i<nums.length; i++){
            rSum += nums[i];
            if(hm.containsKey(rSum-k))
                count += hm.get(rSum-k);
            if(hm.containsKey(rSum))
                hm.put(rSum, hm.get(rSum)+1);
            else
                hm.put(rSum,1);
        }
        return count;
    }
}
