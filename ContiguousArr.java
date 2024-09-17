// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int longest = 0;
        int rsum = 0;

        //initialize the value for 0th element to factor in the first element in array
        map.put(0, -1);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                rsum = rsum - 1;
            else
                rsum = rsum + 1;

            //if map contains the running sum, check if its the longest
            //if doesnt exist, add to it with the index value
            if(map.containsKey(rsum))
                longest = Math.max(longest, i - map.get(rsum));
            else
                map.put(rsum, i);
        }

        return longest;
    }
}