class Solution {
    public int findMaxLength(int[] nums) {
       int t=0;
       int l=0;
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,-1);
       for(int i=0; i<nums.length;i++){
          if(nums[i]==0){
            nums[i]=t-1; t=t-1;
          }
            else{
             nums[i]=t+1;
            t=t+1;
            }
            
            if(!map.containsKey(nums[i]))
             map.put(nums[i],i);
             if(map.containsKey(nums[i])){
                if(l<i-map.get(nums[i]))
                   l=i-map.get(nums[i]);
             }
       } 
       return l;
    }
}