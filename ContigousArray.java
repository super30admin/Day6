class Solution {
    public int findMaxLength(int[] nums) {
        
        
        //Time and Space Complexity :O(N)
        
        int max = 0;
        for(int i =0; i <nums.length;i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        /// we are making 0 as -1 as to consider target value =0  and again reiterating to all values and storing sum and its index in hashmap. so whenever sum is present in hashmap we check its length of that array if its greater then max value then return maxlength. 
        
        
        int target =0;
        
        HashMap<Integer, Integer> hm = new  HashMap<Integer, Integer>();
        hm.put(0,-1);
           
        for(int i =0; i < nums.length; i++){
             target += nums[i];
            if(hm.containsKey(target)){
                int count = i - hm.get(target);
                max = Math.max(count,max);
            }else{
            hm.put(target,i);
            }
            
        }
        
        
        return max;
        
    }
}