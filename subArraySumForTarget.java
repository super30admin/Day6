/*
Approach: rSum and substract target from rSum to register count and increase the count depending
on the how many times this difference is already on the map

Time complexity O(n)
Space complexity O(n)
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int rSum = 0;
        int ct = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // rsum, occurence of rSum
        map.put(rSum, 1);
        for(int i = 0; i < nums.length; i++){
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k)){
                ct = ct + map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return ct;
    }
}