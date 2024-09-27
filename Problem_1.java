// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// get the running sum, then find if the difference of k and sum is present in the hashmap, of yes then increse the count by its value, then store the sum to the hashmap, if present then increase its value.
// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(hm.containsKey(sum-k)){
                count += hm.get(sum-k);
            }
            if(hm.containsKey(sum)){
                hm.put(sum, hm.get(sum)+1);
            }else{
                hm.put(sum, 1);
            }
        }
        return count;
    }
}