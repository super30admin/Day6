import java.util.HashMap;
import java.util.Map;
/*  Problem 1
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

 */
public class SubArraySumEqualsK {
        public int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> m = new HashMap<>();
            int result = 0;
            m.put(0,1);
            int rsum=0;
            for(int i=0; i<nums.length; i++){
                rsum = rsum + nums[i];
                if(m.containsKey(rsum-k)){
                    result = result + m.get(rsum-k);
                }
                m.put(rsum, m.getOrDefault(rsum,0) + 1);
            }
            return result;
        }
}
