class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        int rSum=0;
        int maxLength=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            rSum=rSum+(nums[i]==1?1:-1);
            if(!map.containsKey(rSum))
            {
                map.put(rSum,i);
            }
            else{
                maxLength=Math.max(maxLength,i-map.get(rSum));
            }
        }
        return maxLength;
    }
}