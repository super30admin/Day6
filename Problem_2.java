// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// create an hashmap to store the running sum and get it to find the range of current index and the old one.
// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int count = 0;
        HashMap <Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count = count - 1;
            }else{
                count = count + 1;
            }
            if(hm.containsKey(count)){
                max = Math.max(max, i - hm.get(count));
            }else{
                hm.put(count, i);
            }
        }
        return max;
    }
}