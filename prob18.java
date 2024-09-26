class Solution {
    public int findMaxLength(int[] nums) {
      HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxLen =0;
        int currSum =0;
        
        hashMap.put(0, -1);
        
        for(int x =0; x< nums.length; x++){
            
            if(nums[x]== 0)currSum +=1;
            else currSum -= 1;
            if(hashMap.containsKey(currSum)){
                maxLen= Math.max(maxLen, x - hashMap.get(currSum));
            } else{hashMap.put(currSum, x);
                    
                }
            }
        return maxLen;
        }
}

//tc: o(n)
//sc:o(n)