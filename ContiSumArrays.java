//Time Complexity: O(n).
//Space Complexity: O(n).
//Does this run on leetcode: Yes
//Any problem solving this question:Coming up with logic. 

//This problem can be solved using running sum technique, other than this we can think of different solution like sliding window. Key idea is the Math property. 

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        int max_len = 0;
        int sum = 0;
        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        sumMap.put(0,-1);
        
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] == 0)
                sum = sum - 1;
            else
                sum = sum + 1;
            
            if(!sumMap.containsKey(sum)){
                sumMap.put(sum, i);
            }
            else
            {
                int lowIndex = sumMap.get(sum);
                max_len = Math.max(max_len, i-lowIndex);
                if(lowIndex > i){
                    sumMap.put(sum, i);
                }
            }
        }
    return max_len;
    }
}