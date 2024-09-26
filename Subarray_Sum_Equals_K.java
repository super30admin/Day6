class Solution {
    //Time O(N)
    //Space O(N)
    //Test case {3,4,7,2,-3,1,4,2,0,1}
/*
   Intution :  if ar[x1] - ar[x2] == k then array between x1 and x2 sum equals to k
*/
    public int subarraySum(int[] nums, int k) {
       if(nums == null || nums.length == 0)
       {
           return 0;
       }
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,1);
       int RSum = 0 , ans= 0;
       for(int i=0 ; i<nums.length ; i++)
       {
           RSum += nums[i];
           if(map.containsKey(RSum-k))
           {
              ans += map.get(RSum-k); 
           }
           map.put(RSum , map.getOrDefault(RSum,0) + 1);
       }
        return ans;
    }
}