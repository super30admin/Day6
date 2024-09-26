// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Here we have an Hashmap to store the runningSum of the array and we iterate over the loop to check if the Rsum of the nums[i] is present in the hasmpmap or not. If yes, we update the value of maxlength by comparing the previous max and value of the HashMap. If it is not present, we add that into the map. We calaculate Rsum as when nums[i] == 0, we decrement the Rsum by 1 and if that is 1, then we increment Rsum by 1

class Solution {
    public int findMaxLength(int[] nums) {
        
        //Base case:
        if(nums == null || nums.length == 0){
            return 0;
        }
        // Initializing Hashmap to store Rsum as key and index in value
        HashMap<Integer, Integer> map = new HashMap<>();
        // adding 0 Rsum at index -1 for base case
        map.put(0,-1);
        // Initializing Running sum and length for max continuos subarray for 0 and 1
        int Rsum = 0;
        int length = 0;
        // Initializing For loop to iterate over the array
        for(int i = 0; i< nums.length; i++){
            // Calcualting Running sum based on nums[i] value
            Rsum = nums[i]==0? Rsum-1 : Rsum+1;
            // If the map doesn't contiainf Rsum, we add that Rsum with the index value
            if(!map.containsKey(Rsum)){
                map.put(Rsum, i);
            } else{
                // Else we find the max of the current and the length
                length = Math.max(length, i - map.get(Rsum));
            }
        }
        return length;
        
    }
}