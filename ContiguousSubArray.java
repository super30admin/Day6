class ContiguousSubArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int maxLen = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] == 1) {
                sum += 1;
            } else {
                sum += -1;
            }
            if(map.containsKey(sum)) {
                int diff = i - map.get(sum);
                if(diff > maxLen) {
                    maxLen = diff;
                } 
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}