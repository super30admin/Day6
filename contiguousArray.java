//time complexity O(n)
//space complexity O(n)

class Solution {
    public int findMaxLength(int[] nums) {
        //edge
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int rSum = 0;
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            rSum = nums[i] == 0? rSum - 1: rSum +1;
            if(!map.containsKey(rSum)){
                map.put(rSum, i);
            } else {
                max = Math.max(max, i - map.get(rSum));
            }
        }
        return max;
    }
}
