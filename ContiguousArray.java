/* Leetcode Problem - 525
https://leetcode.com/problems/contiguous-array/
 Time Complexity : O(n)
 Space Complexity : O(1)
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No

Your code here along with comments explaining your approach
1. Assign weights to 1 and 0, 0 => -1 and 1 => 1, so that, for equal number of 0 and 1, the total sum is 0
2. Maintain running_sum at all positions in array
2. Equal number of 0s and 1s can be seen in 2 cases:
a. When the running_sum is 0
b. Running_sum reaches the same value
3. Store runningSums in HashMap <running_sum, times this sum has been seen>

// Testcases: 
[1,0,1,1,1,1,0,0,1,0,1]
[1,0,1,2,3,4,3,2,3,2,3] => running sum
[          |---------|] => length 6
*/
import java.util.HashMap;
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        // [0, 1]
        // [-1,0,]
        
        // Map --> <runningSum, first index where runningSum was seen>
        HashMap<Integer, Integer> map = new HashMap<>();
        int runningSum = 0;
        int max = 0;
        map.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            runningSum = runningSum + ((nums[i] == 0) ? -1: 1);
            if (map.containsKey(runningSum)) {
                max = Math.max(max, i - map.get(runningSum));
            } else {
                map.put(runningSum, i);
            }
        }
        
        return max;
    }
}