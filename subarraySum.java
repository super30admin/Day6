import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int rSum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,1);
        for(int num : nums){
            rSum+=num;
            if(map.containsKey(rSum-k)){
                count+=map.get(rSum-k);
            }
            map.put(rSum,map.getOrDefault(rSum,0)+1);
        }
        return count;
    }
}