class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int rsum=0;
        int res=0;
        hm.put(0,1);
        int n = nums.length;
        for(int i=0;i<n;i++)
        {       rsum+=nums[i];
            if(hm.containsKey(rsum-k))
            {
                res += hm.get(rsum-k);
                 
            }
            if(hm.containsKey(rsum)){
            
                     hm.put(rsum, hm.get(rsum) + 1);
            }
            else{
                 hm.put(rsum,1);
            }
            
        }
        return res;
    }
}

//Time Complexity: O(n), Where n is the length of the input array nums.

//Space Complexity: O(n), Where n is the number of unique cumulative sums that could be stored in the HashMap (in the worst case).