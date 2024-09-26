class Solution {
    //Time O(N)
    //Space O(N)
/*
  Intution: If same RSum repeats then it implies that subarray between them contains equal number of 0's and 1's 
*/
    public int findMaxLength(int[] nums) {
       if(nums == null || nums.length == 0)
       {
           return 0;
       }
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,-1);
       int ans = 0 , RSum = 0;
       for(int i=0 ; i<nums.length ; i++)
       {
           RSum = (nums[i] == 0) ? RSum-1 : RSum+1;
           if(map.containsKey(RSum))
           {
               ans = Math.max(ans , i-map.get(RSum));
           }
           else
           {
               map.put(RSum , i);
           }
       }
        return ans;
    }
}