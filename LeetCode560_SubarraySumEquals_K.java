//approach- get the rsum for every index. 
// becuase we are finding the total number of Subarrays (and not length), we'll store frequency for every sum. 
//Hashmap<rSum, frequency of sum>
//also we will calculate diff with value of k; so rSum - k == key that we will check for and update count accordingly. 
//Time - O(n) -- traversing through array
//space- O(n) - Hashmap

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        if(nums.length ==0 || nums == null) return 0;
        
        //HasMap<rSum   , frequncy)
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); //base case
        
        int count =0, rSum = 0;
        for(int i = 0; i< nums.length; i++)
        {
            rSum = rSum + nums[i];
            int diff =  rSum - k;
            
            if(map.containsKey(diff))
            {
                count = count + (map.get(diff));
            }
                map.put(rSum, map.getOrDefault(rSum, 0)+1);
        }
        return count;
    }
}