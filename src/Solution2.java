class Solution2 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int runningSum = 0;
        int length = -1;
        int maxLength = 0;
        map.put(runningSum, length);
        for(int i=0; i<nums.length; i++){
            // Check if nums[i] is 1 or 0 and add to count if we see 1
            // and subtract from count if we see 0.
            if(nums[i] == 1){
                runningSum+=1;
            }
            else{
                if(nums[i] == 0){
                    runningSum -= 1;
                }
            }
            // If map contains the running sum as a key we find the current length
            // Then check with maxLength to find the maximum length
            // Else we add the running sum and start index as KV pair to the map.
            if(map.containsKey(runningSum)){
                length = i - map.get(runningSum);
                if(length>maxLength) maxLength = length;
            }
            else if(!map.containsKey(runningSum)){
                map.put(runningSum, i);
            }
        }
        return maxLength;
    }
}