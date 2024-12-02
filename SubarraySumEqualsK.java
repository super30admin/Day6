class subarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        int current = 0;
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            current+= nums[i];

            if (current == k) {
                count++;
            }
        }

        return count;
        
    }

}