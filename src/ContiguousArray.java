import java.util.HashMap;
/* Problem 2
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

 */
public class ContiguousArray {
        public int findMaxLength(int[] nums) {
            int max = 0;
            HashMap<Integer, Integer> sumOccuranceMap = new HashMap<>();
            int rsum = 0;
            sumOccuranceMap.put(0, -1);
            for(int i=0; i<nums.length; i++){
                if(nums[i]==1)
                    rsum = rsum + 1;
                else{
                    rsum = rsum - 1;
                }
                if(sumOccuranceMap.containsKey(rsum)){
                    max = Math.max(max, i - sumOccuranceMap.get(rsum));
                }
                else
                    sumOccuranceMap.put(rsum, i);
            }
            return max;
        }
}
