class Solution {
    public int subarraySum(int[] nums, int k) {
          HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
        hmap.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int val=0;
            sum=sum+nums[i];
            val=sum-k;
            
             if(hmap.containsKey(val)){
                        count+= hmap.get(val);
                    }
            
                if(hmap.containsKey(sum)){
                    hmap.put(sum,hmap.get(sum)+1);
                   
                }else{
                    hmap.put(sum,1);
                }           
            
        }
        return count;
    }
}
