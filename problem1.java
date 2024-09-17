import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap();
        hm.put(0,1);
        int count =0;
        int rSum = 0;
        for(int i: nums){
            rSum = rSum + i; 
            if(hm.containsKey(rSum-k)){
                count=count+hm.get(rSum-k);
            }
            if(!hm.containsKey(rSum)){
                hm.put(rSum,0);
            }
            hm.put(rSum,hm.get(rSum)+1);
        }
        return count;
    }
}
