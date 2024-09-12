// Time Complexity - 0(n)
// space Complexity - 0(n)
// Code successfully executed in Leetcode


class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length <= 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = nums[i] == 0 ? sum -1 : sum +1;
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
            max = Math.max(max,i-map.get(sum));
        }
        return max;
    }
    
}