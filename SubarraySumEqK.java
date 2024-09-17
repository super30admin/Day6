// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No  


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //we will store sum of values and the number of times it came in hashmap
        map.put(0,1);//zero will come up atleast once - so prepopulate
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];// add the sums of values
            if(map.containsKey(sum-k)){//check if the target - sum is present in hashmap
                count += map.get(sum-k);//if it does add its count
            }
            map.put(sum, map.getOrDefault(sum,0)+1);//if not add in hashmap
        }
        return count;
    }
}