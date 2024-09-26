class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
        hmap.put(0,-1);
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            int val=0;
            if(nums[i]==0)
                sum=sum-1;
            else
                sum =sum+1;
           if(!hmap.containsKey(sum)){
               hmap.put(sum,i);
           }else{
               if(max<i-hmap.get(sum))
                   max = i-hmap.get(sum);
           }
            
            
        }
        
        
        return max;
    }
}
