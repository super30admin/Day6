class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int rSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1)
                rSum++;
            else
                rSum--;
            if(hm.containsKey(rSum)){ 
                if(max < i - hm.get(rSum))
                    max = i - hm.get(rSum);
            }
            else{
                hm.put(rSum, i);
            }
        }
        return max;
    }
}
