class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int currsum = 0;
        hashMap.put(0,1);
        for(int x:nums){
            currsum += x;
            int complement = currsum-k;
            if(hashMap.containsKey(complement))
                count += hashMap.get(complement);
            hashMap.put(currsum, hashMap.getOrDefault(currsum,0)+1);
            
        
            
        }
        return count;
        
    }
}

//TC: O(n)
//SC: O(n)
