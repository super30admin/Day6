Time Complexity: O(n).
Space Complexity: O(n).
Ran successfully on Leetcode?: yes

class Solution {
    public int findMaxLength(int[] nums) {
        
        int rSum = 0, length = nums.length, maxLength = 0, currLength = 0;
        
        if(length == 0) return maxLength;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        for(int i = 0; i < length; i++) {
            
            rSum += nums[i] == 0 ? -1 : 1;
            
            if(!map.containsKey(rSum)){
                map.put(rSum, i);
            } else {
                currLength = i - map.get(rSum);
                if(currLength > maxLength)
                    maxLength = currLength;
            }
            
        }
        
        return maxLength;
    }
}
