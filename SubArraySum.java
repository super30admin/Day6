import java.util.HashMap;

// Time Complexity : O(n) traverse given array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        
        if(nums==null || nums.length==0){
            return 0;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        int rsum =0;
        map.put(rsum,1);
        
        for(int i=0;i<nums.length;i++){
            rsum = rsum +nums[i];
            if(map.containsKey(rsum-k)){
                count=count+map.get(rsum-k);
            }
            if(map.containsKey(rsum)){
                map.put(rsum,map.get(rsum)+1); //increment count if already present
            }
            else{
                map.put(rsum,1); //1st encounter
            }
        }
        
        return count;
    }
}