//equal number of 0's and 1's  mean ==  length will always be even

//approach- start taking sum at every index, and parallely check if sum exist at the map -- if not, put the sum and index as key-val pair. 
//so if we ever find sum at newIdx, which is existing in map showing val as oldIdx, that means, thatnewIdx - OldIdx will have the equal number of zeros and 1s and so, we calculate length, save it and go on. If we ever find bigger length, then we'll update our length variable,

//time- O(n) -- traversing through the array. No time dded for Hashmap lookup here(on the backend its lookup time is considerable time, but we ignore it and take it as constant considering/assuming our design,  we have 100 nodes into the nested DS for Hashmap!!  )

class Solution {
    public int findMaxLength(int[] nums) {
        
        //base case
        if(nums.length < 2 || nums == null) return 0;
        
        int len = 0, rSum =0;
        
        //HashMap<rSum, Index  >
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1); // to cover the base case of [1,0] where if we dont put this values, it's gnna return len =0.
        //calculate running sum and just update the nums itself 
        //ex: [1,0,1,0,1,1,1,1,0,0,1,0,0,1]
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i] == 1)
                rSum++;
            else
                rSum--;
           
            //check if map has key(Sum)
            if(!map.containsKey(rSum))
            {
             map.put(rSum, i);
            }
            else
            {
               len = Math.max(len, i-map.get(rSum));  
            }
        }
        return len;
    }
}