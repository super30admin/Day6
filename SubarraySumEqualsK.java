// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Problem while adding the running sum to the map

// Notes : Keep taking the difference between the running sum and the target, and check if the difference is present in the Map. If difference is present, we have found the sub-array. Map contains the frequency of the running sum values.

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if( nums == null || nums.length == 0 ) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        
        int runningSum = 0;
        int countOfArray = 0;
        
        for( int i = 0; i < nums.length; i++){
            runningSum = runningSum + nums[i];
            
            int difference = runningSum - k;
            
            if( map.containsKey(difference) ){
                countOfArray = countOfArray + map.get(difference);
            } 
            
            if(map.containsKey(runningSum)){
                map.put( runningSum, map.get(runningSum) + 1);
            } else {
                map.put( runningSum, 1);
            }
        }
        
        return countOfArray;
    }
}
