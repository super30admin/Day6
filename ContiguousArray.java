import java.util.HashMap;
import java.util.Map;


//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/*
 * We use the running sum concept here. We assume 0 as '-1' and find sum of all elements till that index for each index, call this running sum. We create a map of running sum, index.
 * Each index we calculate running sum to find if this difference has appeared before. If it did then we find the index from the map for that difference.
 * We calculate the current index- index from the map and store max of such differences.
 * At the beginning running sum is 0, add that dummy entry to handle edge case.
 */

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int runningsum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                runningsum--;
            }else{
                runningsum++;
            }
            if(map.containsKey(runningsum)){
                ans=Math.max(ans,i-map.get(runningsum));
            }else{
                map.put(runningsum,i);
            }
        }
        return ans;
    }
}
