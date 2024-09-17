class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        hm.put(0,-1);
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum=sum-1;
            }else{
                sum=sum+1;
            }

            if(!hm.containsKey(sum)){
                hm.put(sum,i);

            }else{
                maxLength= Math.max(maxLength, i-hm.get(sum));
            }
        }
        return maxLength;
    }
}