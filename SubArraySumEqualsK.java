// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//We will find the prefix for every position, and check if its complement to k exist in the map or not.
//We will add the number of complements that is existing to it.
//We will maintain a hashmap that would store the values of prefix sums and their occurances/frequency.
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int prefix = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            prefix += cur;
            int complement = prefix - k;
            if(hm.containsKey(complement)){
                count += hm.getOrDefault(complement,0);
            }
            hm.put(prefix,hm.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}