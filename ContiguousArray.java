class ContiguousArray {
    
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        
        int prefix[] = new int[nums.length+1];
        prefix[0] = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                nums[i] = -1;
            prefix[i+1] = nums[i] + prefix[i-1+1];
        }
        
        int maxVal = 0;
        hashMap.put(0,0);
        for(int i = 0; i < nums.length; i++){
            if(prefix[i+1] == 0){
                maxVal = i+1;
            }
            
            if(hashMap.containsKey(prefix[i+1]))
            {
                    maxVal = Math.max(maxVal,i-hashMap.get(prefix[i+1])+1);
                }
            
            if(!hashMap.containsKey(prefix[i+1])){
                hashMap.put(prefix[i+1],i+1);
            }
        }
        return maxVal;
    }
}