/**
Time complexity: O(n)
Space complexity: O(n)
Executed on Leetcode: Yes
Any problems faced: No
*/

class Solution {
    /**
    Approach:
    - Initialize hashMap, max and currentSum. Add (0,-1) to the hashMap.
    - If nums[i] is 0, increment the currentSum.
    - If nums[i] is 1, decrement the currentSum.
    - Check if the hashMap contains the currentSum as key:
      If it doesn't, add it to the hashMap.
      If it does, compute the start and end. Compute Max(max, end-start)
    - Return max. 
    */
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int max = 0;
        int currentSum = 0;
        hashMap.put(0,-1);
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                currentSum += 1;
            } else {
                currentSum -= 1;
            }
            
            if(hashMap.containsKey(currentSum)) {
                int end = i;
                int start = hashMap.get(currentSum);
                max = Math.max(max, end-start);
            } else {
                hashMap.put(currentSum, i);
            }
        }
        return max;
    }
}
