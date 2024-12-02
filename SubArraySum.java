class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            int compliment = sum -k;
            if(map.containsKey(compliment)){
                count = count + map.get(compliment);
            }
            map.put(sum, map.getOrDefault(sum,0) + 1 );
        }
        return count;
    }
}