class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        HashMap <Integer,Integer> h= new HashMap<>();
        int max = 0;
        h.put(0,-1);
        int rSum = 0;
        for(int i=0;i<nums.length;i++){
            rSum = nums[i] == 0?rSum-1:rSum+1;
            if(h.containsKey(rSum)){
                max = Math.max(max,i-h.get(rSum)); 
            }else{
                h.put(rSum,i);
            }
        }
        return max;
    }
}
