1)Subarray Sum K
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        int prefix_sum=0;
        h.put(0,1);
        for(int i:nums){
            prefix_sum=prefix_sum+i;
                if(h.containsKey(prefix_sum-k)){
                    count=count+h.get(prefix_sum-k);
                }
            h.put(prefix_sum,h.getOrDefault(prefix_sum,0)+1);
        }
        return count;
    }
}
