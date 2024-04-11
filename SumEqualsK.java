// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length == 1 && nums[0] != k) return 0;
        int count = 0;
        int rSum = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for (int i = 0; i < nums.length; i++){
            rSum = rSum + nums[i]; //Calculates the rSum by adding the elem
            int comp = rSum - k; //And calculates the comp
            if(map.containsKey(comp)){ //If the comp is present in the map
                count += map.get(comp); //Add the value of the key(comp) to the counter
            }
            if(map.containsKey(rSum)){
                    int value = map.get(rSum) + 1; //Also add +1 to the value if the rSum is repeated
                    map.put(rSum, value);
                } else{
                    map.put(rSum, 1); //Otherwise add the key and initialize the value with 1 as it is found once yet.
                }
            }
    return count;
    }
}