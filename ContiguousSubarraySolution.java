class ContiguousSubarraySolution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();

        int rSum = 0;
        int max = 0;
        hm.put(rSum, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                rSum++;
            } else {
                rSum--;
            }
            if (hm.containsKey(rSum)) {
                max = Math.max(max, i - hm.get(rSum));
            } else {
                hm.put(rSum, i);

            }
        }
        return max;
    }
}