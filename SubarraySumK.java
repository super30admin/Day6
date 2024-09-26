// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
	
	public int subarraySum(int[] nums, int k) {
        int sum =0, ans =0;
        Map<Integer,Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        for(int i=0; i<nums.length;i++){
            sum += nums[i];
            if(preSum.containsKey(sum-k)){
                ans += preSum.get(sum-k);
            }
            preSum.put(sum, preSum.getOrDefault(sum,0)+1);
        }    
            return ans;
    }

	public static void main(String[] args) {
		SubarraySumK obj = new SubarraySumK();
		int nums[] = {1,1,1};
		int res = obj.subarraySum(nums, 2);
		System.out.println(res);
	}

}
