class subarraySum {

     // Time Complexity - O(n) Space COmplexity - O(n)
    public int subarraySum(int[] nums, int x) {
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        hashMap.put(0,1);
        int count = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i]; 
           
            int val = sum-x;
               if(hashMap.containsKey(val)){
               //  hashMap.put(sum,hashMap.get(sum)+1);
                count = count+hashMap.get(val);
            }
            hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}