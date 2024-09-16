// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : visualising running sum pattern

class Solution {
    public int findMaxLength(int[] nums) {
        int rsum = 0;
        int maxLength = 0;
        HashMap<Integer,Integer> map = new HashMap<>(); //running sum, earliest index at which rsum occured
        map.put(0,-1);  //initializing map so that we don't miss the pair occuring at 0th index
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                rsum++;
            else
                rsum--;
          
            if(map.containsKey(rsum)){  //between two same rsums, subarray is balanced
                int length = i - map.get(rsum); // calculate length of current balanced subarray
                maxLength = Math.max(maxLength, length);  //comare the length of current subarray with previous largest subarray
            } else {  //new rsum & the current index to be added in map 
                map.put(rsum, i);
            }
        }
        
        return maxLength;
    }
}
