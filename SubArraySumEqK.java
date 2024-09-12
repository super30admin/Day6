//TC: O(N) as travelling once for all the elements using HashMap;
//SC: O(1)
//Running: Yes

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int rSum=0;
        int freq;
        int count=0;
        
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rSum=rSum+nums[i];
            
            if(map.containsKey(rSum-k)){
                count= count+ map.get(rSum-k);
            }
            map.put(rSum,map.getOrDefault(rSum,0)+1);
        }
        return count;
    }
}
