import java.util.HashMap;

public class Subarray_sum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int rSum=0, ans =0;
        hm.put(0,1);
        for(int i=0; i<nums.length; i++){
            rSum+=nums[i];
            
            if(hm.containsKey(rSum-k)){
                ans+=hm.get(rSum-k);
            }
            if(!hm.containsKey(rSum)){
                hm.put(rSum,0);
            }
            hm.put(rSum, hm.get(rSum) + 1);
        }
        return ans;
    }
}
