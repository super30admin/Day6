class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int max = 0;
        int rSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rSum = rSum - 1;
            }else {
                rSum = rSum + 1;
            }
            if(map.containsKey(rSum)) {
                max = Math.max(max, (i - map.get(rSum)));
            }else {
                map.put(rSum, i);
            }
        }

        return max;
    }
}