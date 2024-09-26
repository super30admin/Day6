// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int sum =0;
        // <sum, index>
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i< nums.length; i++){
            int val = nums[i]==1 ? nums[i] : -1;
            sum = sum + val;
            if(sum==0){
                max = i +1;
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }else{
                max = Math.max(max, i - map.get(sum));
            }
        }
        return max; 
    }
}