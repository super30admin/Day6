
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0,1);
        for(int i : nums) {
            sum += i;
            
            //calculate compliment at each element sum-k
            int comp = sum - k;
            
            //if it already exist means we encountered that sum
            if(map.containsKey(comp)) {
                count += map.get(comp);
            }
            
            //put or update current sum in map
            if(map.containsKey(sum)) {
                map.put(sum,map.get(sum)+1);
            } else {
                map.put(sum,1);
            }
            
        }
        return count;
    }
}
