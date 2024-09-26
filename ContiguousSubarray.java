
class ContiguousArray {
    public int findMaxLength(int[] nums) {
        /*
         *
         * Time Complexity: O(n) to iterate over the entire nums array
         * Space Complexity: O(n) to store each element in a running sum array
         *
         */
        
        // Base case
        if (nums.length == 0 || nums == null) return 0;
        
        // Logic - Running Sum
        
        int max = 0;
        int sum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();        
        // add edge case
        map.put(0, -1);
        
        int[] rSum = new int[nums.length];
        
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                sum -= 1;
                rSum[i] = sum;
            } else {
                sum += 1;
                rSum[i] = sum;
            }
        }
        
        for (int i=0; i<nums.length; i++) {
            if (!map.containsKey(rSum[i])) {
                map.put(rSum[i], i);
            } else {
                max = Math.max(max, i - map.get(rSum[i]));
            }
            
        }
        
        return max;
        
    }
}
