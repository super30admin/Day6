class ContiguousArray {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int findMaxLength(int[] nums) {
        int result = 0;
        int currSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)
                currSum += 1;
            else
                currSum -= 1;
            
            if(currSum == 0)
                result = Math.max(result, i + 1);
            else if(map.containsKey(currSum))
                result = Math.max(result, i - map.get(currSum));
            else
                map.put(currSum, i);
        }
        
        return result;
    }
}