// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
//https://leetcode.com/problems/subarray-sum-equals-k/
// Any problem you faced while coding this : No
import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
    public int subarraySum(int[] nums, int k){
        int n = nums.length;
        int count = 0;
        int prefixSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0;i<n;i++){
            prefixSum = prefixSum + nums[i];
            if(map.containsKey(prefixSum-k)){
                count = count + map.get(prefixSum-k);
            }
            map.put( prefixSum, map.getOrDefault( prefixSum, 0) + 1);
            
        }
        return count;
    }
}
