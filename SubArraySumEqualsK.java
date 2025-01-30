import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


//We use the running sum concept here. We find sum of all elements till that index for each index, call this running sum. We create a map of running sum, frequency.
//Each index we also calculate running sum- target to find if this difference has appeared before. If it did then we find the frequency from the map for that difference
//and increase the result by that frequency. At the beginning running sum is 0, add that dummy entry to handle edge case.
public class SubArraySumEqualsK {
    
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int runningsum=0;
        int result=0;
        for(int i=0;i<n;i++){
            runningsum=runningsum+nums[i];
            if(map.containsKey(runningsum-k)){
                result=result+map.get(runningsum-k);
            }
            if(map.containsKey(runningsum)){
                map.put(runningsum,map.get(runningsum)+1);
            }else{
                map.put(runningsum,1);
            }
        }
        return result;
    }

}
