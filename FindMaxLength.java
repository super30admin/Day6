/** 
*Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
*Time and space complexity O(n)
* Store the running sum and index of the running sum if it is not in hashmap. Every time you encounter the same running sum, the current index minus the value of running sum from map gives the length.
* Each time before updating the length, check if the current max sum is smaller than the new value 
*/
class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length < 0 )
        {
            return 0;
        }
        HashMap<Integer, Integer> rsumIdx = new HashMap<Integer, Integer>(); 
        rsumIdx.put(0, -1);
        int rSum = 0;
        int maxLength = 0;
        for (int i = 0; i<nums.length; i++) {
            rSum += nums[i] == 0 ? -1 : 1;
            if(rsumIdx.containsKey(rSum)) {
                int currSum = i - rsumIdx.get(rSum);
                maxLength = Math.max(currSum, maxLength);
            }
            else {
                rsumIdx.put(rSum, i);
            }
        }
        return maxLength;
    }
}
