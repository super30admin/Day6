// Time Complexity : O(n) single iteration over all elements
// Space Complexity : O(n) because HashMap used to store the n occurances for processing
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        //null check
        if( nums == null || nums.length == 0 ) return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0,1); //for safety of calculating initial elements as subarray
        
        int rSum = 0; // for calculating running sum
        
        for( int i=0; i < nums.length; i++ ) { //visiting each element once
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k)) { //checking compliment of running sum
                //which means subarray exists
                count = count + map.get(rSum - k); //its occurance is mapped in map
            }
            if(map.containsKey(rSum)) { //now checking if new rSum has already occured
                map.put(rSum, map.get(rSum) + 1); //adding 1 to count
            }
            else {
                map.put(rSum, 1); //if it is not present, new entry with 1 count
            }
        }
        return count; //returning total count in the end
    }
}