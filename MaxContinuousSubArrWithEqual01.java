// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class MaxContinuousSubArrWithEqual01 {
    Map<Integer, Integer> total = new HashMap<>();
    int max = 0;
    int sum = 0;
    public int findMaxLength(int[] nums) {
        total.put(0, -1);
        for(int i=0; i<nums.length;i++){
            sum += nums[i] == 0? -1 : 1;
            if(total.containsKey(sum)){
                max = Math.max(max, i - total.get(sum));
            }
            else{
                total.put(sum, i);
            }
        }
        return max;
    }
}
