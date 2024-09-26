// Time Complexity : O(n), where n is size of array
// Space Complexity : O(n), Hash table
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :



class Solution {
    public int findMaxLength(int[] nums) {
        int curlen = 0;
        int maxlen = 0;
        int diff = 0;
        HashMap<Integer,Integer> map = new HashMap<>(); //(diff,index)
        map.put(0,-1); //diff = 0 for index = -1
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) diff++;
            if(nums[i] == 0) diff--;
            
            if(map.containsKey(diff)) {
                curlen = i - map.get(diff);
                maxlen = Math.max(curlen, maxlen);
            }
            else{
                map.put(diff, i);
            }
        } return maxlen;      
    }
}

