import java.util.HashMap;

public class Solution2 {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0)
            return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int rsum=0;
        int count=0;
        //sum 0 occurs once
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];
            //move k steps back to get subarray with sum k
            if(map.containsKey(rsum-k)){
                //add up all values os occurence with same rsum.
                count=count+map.get(rsum-k);
            }
            map.put(rsum,map.getOrDefault(rsum,0)+1);
        }
        return count;
    }
}