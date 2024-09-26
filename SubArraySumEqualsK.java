
class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        /*
         * Time Complexity: O(n) for accessing each element
         * Space Complexity: O(n) for storing the running sum for each element
         *
         */
        if (nums.length == 0 || nums == null) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int total = 0;
        
        map.put(0, 1);
        
        for (int i=0; i<nums.length; i++) {
            
            rSum = rSum + nums[i];
            
            int diff = rSum - k;
            
            if (map.containsKey(diff)) {
                total += map.get(diff);                
            }
            
            int inc = map.getOrDefault(rSum, 0) + 1;
            map.put(rSum, inc);
        }
        
        return total;
    }
}
