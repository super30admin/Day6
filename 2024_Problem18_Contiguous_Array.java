//525. Contiguous Array - https://leetcode.com/problems/contiguous-array/description/
//Time Complexity: O(n)
//Space Complexity: O(n)

//HashMap using Running Sum

class Solution {
    public int findMaxLength(int[] nums) {
        int runningSum = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //at index 0, running sum is -1
        map.put(0,-1);  //base condition

        for(int i=0; i<nums.length; i++){
            //at occurance of 1, +1: at occurance of 0, -1
            runningSum += (nums[i] == 0) ? -1 : 1;

            if(map.containsKey(runningSum))
                maxLen = Math.max(maxLen, i - map.get(runningSum));
            else
                map.put(runningSum, i);
        }
        return maxLen;
    }
}