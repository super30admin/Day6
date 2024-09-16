// Time Complexity: O(n)
// Space Complexity: O(n)
// Program ran on Leetcode successfully

class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumBefore = new HashMap<>();
        sumBefore.put(0,1);
        int num = 0;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            if (sumBefore.containsKey(curr - k))
                num += sumBefore.get(curr - k);
            sumBefore.put(curr,sumBefore.getOrDefault(curr,0)+1);
        }
 
        return num;
        
    }
}
