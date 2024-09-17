// Time Complexity: O(N)
// Space Complexity: O(N)
// Did it run successfully on Leetcode? YES
class Solution {
    public int subarraySum(int[] nums, int k) {
       if (nums == null || nums.length == 0) return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap();
        map.put(0, 1) ;
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            runningSum = runningSum + nums[i];
            int compliment = runningSum - k;
            if (map.containsKey(compliment))
            {
                count = count + map.get(compliment);
            }
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
        }
       return count;
    }    
}

