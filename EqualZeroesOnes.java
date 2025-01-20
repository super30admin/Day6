// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
//https://leetcode.com/problems/contiguous-array/description/
// Any problem you faced while coding this : No
import java.util.HashMap;
import java.util.Map;

public class EqualZeroesOnes {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i]==0) nums[i] = -1;
        }
        int maxLen = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();

        //handle case :if prefix sum becomes 0, the subarray from the start to current has equal number of 0 & 1
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i - map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
