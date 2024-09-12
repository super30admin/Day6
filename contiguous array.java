time complexity: O(n)
space complexity: O(n)

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length; //length of nums array
        if (n<=0) return 0; //initial check
        Map<Integer,Integer> countToIndex = new HashMap<>();
        countToIndex.put(0,-1); // just before the beginning of the array nums
        int count = 0; //initialising count to 0
        int maxLen = 0; //maxlen to 0
        for (int i = 0; i < n; i ++) 
        {
            count = count + (nums[i]==0?1:-1); //if we find 0, we add 1 to count or else -1
            if (!countToIndex.containsKey(count))
            {
                countToIndex.put(count, i); //putting in the hashmap
            }
            else
            {
                maxLen = Math.max(maxLen, i-countToIndex.get(count)); //getting maxlen
            }
        }
        
        return maxLen;
    }
}