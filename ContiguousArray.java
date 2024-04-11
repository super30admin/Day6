// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int max = 0;
        if(nums == null || nums.length == 0) return 0;
        map.put(0, -1); //Initializes the map with 0 and -1
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) rSum--; //If the elem is 0, then rSum is -1
            else rSum++; //If the elem is 0, then rSum is +1
            if(map.containsKey(rSum)){
                if (max < i - map.get(rSum)){ ///Checks if max is less than the index at the current rSum
                    max = i - map.get(rSum); //If it is, it would replace it with the value of rSum
                }
            } else{
                map.put(rSum, i); //If it is not present then it add's the key value pair to the map
            }
        }
        return max;
    }
}