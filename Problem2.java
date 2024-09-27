class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int max = Integer.MIN_VALUE;
        int cumSum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                cumSum--;
            cumSum+=nums[i];
            if(map.containsKey(cumSum))
                max = Math.max(max, i-map.get(cumSum));
            else
                map.put(cumSum,i);
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}