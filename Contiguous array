class Solution {
    public int findMaxLength(int[] nums) {
        int max =0;
        int currentSum = 0;
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                currentSum=currentSum+1;
            }
            else{
                currentSum=currentSum-1;
            }
            
            if(hm.containsKey(currentSum)){
                int end = i;
                int start = hm.get(currentSum);
                
                max = Math.max(max, end-start);
            }
            else{
                hm.put(currentSum,i);
            }
        }
        return max;
    }
}
