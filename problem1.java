// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes


// Your code here along with comments explaining your approach
/*
    1. create hashmap store running sums and numbber of times that running
    sum is calculated.
    2. see if value of running sum - k exists in hashmap and increase the output value
    with the valuse of running sum - k if it exists.
*/


class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> s = new HashMap<>();
        int output = 0;
        int sum = 0;
        s.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(s.get(sum) == null){
                s.put(sum,0);
            }
            if(s.containsKey(sum - k)) output = output + s.get(sum - k);
            s.put(sum, s.get(sum) + 1);
        }
        return output;
    }
}