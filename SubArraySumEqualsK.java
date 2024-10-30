// Time Complexity :O(n)
// Space Complexity :O(n)
// Approach : Maintaining running sum as key and frequency as value in a hashmap. As we iterate through the array and if come across the runningSum - target 
// in map then increment the frequency. maintain the count variable and update it when you find the compliment
class Solution {
    public int subarraySum(int[] nums, int k) {
        int rSum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>(); // rSum , frequency
        map.put(0,1); // running sum 0 happens 1 time
        // [1,2,3] nums
        // [1,3,6] running Sum
        // [0,1,2] indexes
        for(int num: nums){
            rSum += num; // 0+1 = 1,3,6
            int comp = rSum-k; // 1-3 = -2 , 3-3 = 0 , 6-3 = 3

            if(map.containsKey(comp)){
                count += map.get(comp); // 1 + 1 = 2
            } 

            map.put(rSum,map.getOrDefault(rSum,0) + 1); //{0:1, 1:1, 3:1, 6:1 }
        }
        return count;
    }
}