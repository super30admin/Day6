class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> hm=new HashMap();
        int sum=0;
        int count=0;
        hm.put(0,1);

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];

            if(hm.containsKey(sum-k)){
                count=count+hm.get(sum-k);
            }
            if(hm.containsKey(sum)){
                hm.put(sum,hm.get(sum)+1);
            }else{
                hm.put(sum,1);
            }
        }
        return count;
    }
}