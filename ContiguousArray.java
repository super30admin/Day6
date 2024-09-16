// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class ContiguousArray{
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        HashMap <Integer,Integer> sums = new HashMap<>();
        int max = 0;
        int running_sum = 0;

        //running sum, index
        sums.put(0,-1);

        for(int i = 0; i < nums.length; i++){

            //if current is 0
            if(nums[i] == 0){
                running_sum = running_sum - 1;
            }
            else{
                running_sum++;  //if current is 1
            }

            if(sums.containsKey(running_sum)){   //if running sum already is in map, then diff is 0 and we found another subarray
                max = Math.max(max, i - sums.get(running_sum));  //if the current length of balanced 0s and 1s
            }
            else{
                sums.put(running_sum, i);
            }
        }
        return max;
    }
}






