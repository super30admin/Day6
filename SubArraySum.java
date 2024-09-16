// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class SubArraySum{
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        //edge case if k is the only element in array
        if(nums.length == 1){
            if(nums[0] != k){
                return 0;
            }
            else{
                return 1;
            }
        }

        HashMap <Integer, Integer> sums = new HashMap<>();

        sums.put(0,1); //there is 1 way to add to 0
        int running_sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            running_sum += nums[i];

            int diff = running_sum - k; //this value should be in hashmap if there is a subarray
            if(sums.containsKey(diff)){
                count += sums.get(diff);
            }

            //update running sum in hashmap
            if(sums.containsKey(running_sum)){
                sums.put(running_sum,sums.get(running_sum) + 1);
            }
            else{
                sums.put(running_sum,1);
            }
        }
        return count;
    }
}
