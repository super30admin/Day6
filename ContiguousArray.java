// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 525

class Solution {
    public int findMaxLength(int[] nums) {
        
        //edge case
         if(nums == null || nums.length == 0 ){
            return 0;
        }
        int sum = 0;
        int max = 0 ; 
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        
        //check if the sum exists 
        for(int i = 0 ; i < nums.length; i++){
            //add 1 if the ith element is 1 or add 0 if the ith element is 0
            sum = nums[i] == 0 ? sum - 1 : sum + 1;
            //if the sum exists, find the max using the max function
            if(map.containsKey(sum)){
                max = Math.max(max,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
                       
}