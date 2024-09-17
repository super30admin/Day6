// Time - O(N)
// Space - O(N)

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums == null) {
            return 0;
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        
        int rsum = 0, Max = 0;
        
        for(int i=0;i<nums.length;i++) {
            
            rsum = nums[i] == 0 ? rsum - 1 : rsum + 1;
            if(map.containsKey(rsum)) {
                Max = Math.max(Max, i - map.get(rsum));
            }
            else {
                map.put(rsum, i);
            }                    
        }
        
        return Max;
    }
}
