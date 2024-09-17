// Time Complexity: O(n) where n is the length of the input array
// Space Complexity: O(n) 

class SolutionTwo {
    public int findMaxLength(int[] nums) {
        // Edge cases
        if(nums.length < 1 || nums.length > 50000){
            return 0;
        }
        
        int longest = 0;
        int runningCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
                
        map.put(runningCount, -1);
        
        for(int i = 0; i<nums.length; i++ ){
            if(nums[i] == 0){
                runningCount += -1;
            }
            else{
                 runningCount += 1;
            }
            
            if(map.containsKey(runningCount)){
                longest = Math.max(longest, i - map.get(runningCount));
            }
            else{
                map.put(runningCount, i);
            }
        }
        return longest;
    }
}
