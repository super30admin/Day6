// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had doubts regarding usage of the HashMap to store running sum and its first encountered index

// Notes : Used running sum, by adding new running sum values to the hashmap. If map already contains the running sum value, then take difference between the key of running sum and the current index to find the length of the contiguous array. 

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put( 0, -1 );
        
        int maxLength = 0;
        int runningSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            if( nums[i] == 0){
                runningSum = runningSum - 1;
            } else {
                runningSum = runningSum + 1;
            }
            
            if( map.containsKey(runningSum) ){
                maxLength = Math.max(maxLength, i - map.get(runningSum) );
            } else{
                map.put( runningSum, i );
            }
        }
        return maxLength;
    }
}
