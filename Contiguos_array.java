// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// when 0 is seen do -1 and when 1 is seen do +1 for each array element.
// Use hashmap to save index as a value and and result of sum as per above rule as a key
// when repeated sum is seen refer hashmap to find previous index of similar sum.
// return max of index of latest sum - index of previous sum by traversing array  

class Solution {
    public int findMaxLength(int[] nums) {
                if(nums == null || nums.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int max = 0;

        map.put(rSum, -1); // edge case for [0, 1]

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                rSum += 1;
            }
            else{
                rSum -= 1;
            }
            if(map.containsKey(rSum)){
                max = Math.max(max , i - map.get(rSum));
            }
            else{
                map.put(rSum, i);
            }
        } 
        return max;
    }
}