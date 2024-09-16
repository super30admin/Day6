class SubArraySumEqualsK {
    HashMap<Integer, Integer> complement = new HashMap<>();
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        complement.put(0, 1);
        int sum = 0;
        for(int num : nums){
            sum += num;
            if(complement.containsKey(sum - k)){
                count+=complement.get(sum-k);
            }

            complement.put(sum, complement.getOrDefault(sum,0)+1);
        }
        return count;
    }
}