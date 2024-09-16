class Solution {
	
	
	
	
    public int subarraySum(int[] nums, int k) {
        
        int count =0, sum=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            if(sum==k)
                count++;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}