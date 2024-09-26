// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Here we have an Hashmap to store the runningSum of the array and we iterate over the loop to check if the compliment of the nums[i] is present in the hasmpmap or not. If yes, we increment the counter and also the value of the hasmap and if not, we add that Rsum as the key and occurence of that Rsum as 1

class Solution {
    public int subarraySum(int[] nums, int k) {
        //Base case
        if(nums ==  null || nums.length == 0){
            return 0;
        }
            
        // Initializing HashMap to store the Running sum as key and occurence of it as value;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Adding key value pair (0,1) for base case
        map.put(0,1);
        // Initializing counter and RunningSum
        int count = 0;
        int Rsum = 0;
        // Initialing for loop to iterate over the nums array
        for(int i = 0; i< nums.length;i++){
            //Calculating RSuma and its complement
            Rsum += nums[i];
            int complement = Rsum - k;
            // Check if map contains the complenment. If yes, increment count if, add Rsum to the map
            if(map.containsKey(complement)){
                count += map.get(complement);
            }
            if(!map.containsKey(Rsum)){
                map.put(Rsum, 1);
            } else{
                map.put(Rsum, map.get(Rsum) + 1);
            }
        }
        return count;
        
    }
}