class Solution {
    // T.C: O(n)
    // S.C: O(n)
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // rsum and index where the rsum occurs
        int rsum = 0;
        int len = 0;
        map.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
                rsum = rsum + 1;
            else
                rsum--;
            if (map.containsKey(rsum)) {
                len = Math.max(len, i-map.get(rsum));
            }
            else
                map.put(rsum, i);
        }
        return len;
    }
}