//Time Complexity - O(n)
// Space Complexity - O(n)
//This solution worked on Leetcode as opposed to the brute force solutions of time complexity O(n^2) and O(n^3)
//  In this soltution, we are considering complement instead of traversing the array n times for each element and calculating the running sum. This way we will get the O(n) time complexity solution. The HashMap will keep record of the running sum that we get. And everytime the same running sum occurs, the value of the runningSum key will be incremented in the HashMap. The count will keep record of the number of subarrays that will give a sum of k. Thus, to get the count we will use complement (running sum - k) and everytime the same complement occurs which is already in the Hashmap as key, we will increment the count with it's value in HashMap.



class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)  return 0;  // Edge Case
        //Logic
        int complement = 0;          // Take complement to 
        int count = 0;
        int runningSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            runningSum += num;
            complement = runningSum - k;
            if(map.containsKey(complement))
                count += map.get(complement);
            if(map.containsKey(runningSum))
                map.put(runningSum, map.get(runningSum)+1);
            else
                map.put(runningSum,1);
        }
        return count;
    }
}
