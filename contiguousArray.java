// findMaxLength
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on GeeksforGeeks : yes
// Any problem you faced while coding this : no

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hMap = new HashMap<>();
        int max = 0;
        int rSum = 0;
        hMap.put(0,-1);
        for(int i =0; i< nums.length; i++){
            
            if(nums[i] == 0) {
                rSum = rSum - 1;
            } else {
                rSum = rSum + 1;
            }
            
            if(hMap.containsKey(rSum)) {
                max = Math.max(max, i - hMap.get(rSum));
            } else {
                hMap.put(rSum, i);
            }
            
        }
        return max;
        
    }
}