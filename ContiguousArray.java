/*
-Time Complexity : O(n^2) 
-Space Complexity : O(1)
-code here along with comments explaining approach
------ Brute force------
1. we will consider every possible subarray and count numbers of zeros and once in each subarray. Then we find out maximum length subarray with equal number of zeros and once.

-Time Complexity : O(n) 
-Space Complexity : O(n)
-code here along with comments explaining approach
------ Brute force------
1. we will consider every possible subarray and count numbers of zeros and once in each subarray. Then we find out maximum length subarray with equal number of zeros and once.
---HashMap--------
We make an entry for a count in the map whenever the count is encountered first, and later on use the correspoding index to find the length of the largest subarray with equal no. of zeros and ones when the same count is encountered again.
*/
public class Solution {
    public int findMaxLength(int[] nums) {
        int maxCount=0, runningSum=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0; i< nums.length; i++){
            
            runningSum = (nums[i] == 1) ? runningSum+1 : runningSum-1;
            
            if(map.containsKey(runningSum))
                maxCount= Math.max(maxCount, i-map.get(runningSum));
            else
                map.put(runningSum , i);
        }
        return maxCount;
    }
}

