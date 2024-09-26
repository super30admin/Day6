//Time Complexity: O(N)
//Space Complexity:O(N)
class Solution {
    public int subarraySum(int[] nums, int k) {
        //Key Rsum, Value:No of times Rsum is present
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int rsum=0;
        //Default case
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];
            if(map.containsKey(rsum-k)){
                count=count+map.get(rsum-k);
            }
            map.put(rsum,map.getOrDefault(rsum,0)+1);
            
        }
        return count;
    }
}
