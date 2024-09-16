class Solution {
    // Time Complexity: O(n)
    public int subarraySum(int[] nums, int k) {
        // If array is null return 0
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        // The hashmap stores sum and how many time the corresponsing sum value is achieved
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
       int count = 0;
       int sum = 0;
       // Zero is added to deal when sum == k 
       map.put(0,1);
       for(int i=0;i<nums.length;i++)
       {
         sum+=nums[i];
         int val = sum - k;

         if(map.containsKey(val))
         {
           count+=map.get(val);
         }

        //  if(map.containsKey(sum))
        //  {
        //     map.put(sum, map.get(sum)+1);
        //  }
        //  else {
        //      map.put(sum,1);
        //  }
        map.put(sum, map.getOrDefault(sum,0)+1);
       }

       return count;

    }
}
