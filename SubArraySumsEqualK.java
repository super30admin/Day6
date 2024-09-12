// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : still thinking if we can terminate
//                                          the inner loop and save the sum
//                                        which we are repetitively calculating

class SubArraySumsEqualK
{
  public int subarraySum(int[] nums, int k)
  {
     int sum = 0;
     int count = 0;

     for(int i = 0; i < nums.length; i++)
     {
         sum = nums[i];

         if(sum == k) count++;

         for(int j = i+1; j < nums.length; j++)
         {
             sum += nums[j];

             if(sum == k) count++;
         }
     }

     return count;
   }
}


// Solution with improved time complexity : O(N) using prefix sum and HashMap
// time complexity : O(N)
// space complexity : O(N), worst case it was increasing sum
//                   and we had to include keys for each sum.
public int subarraySum(int[] nums, int k)
{
  Map<Integer, Integer> map = new HashMap<Integer, Integer>();

// extra case added to make sure the first time k sum appears we don't miss it.
  map.put(0, 1);
  int count = 0;
  int sum = 0;

  for(int i = 0; i < nums.length; i++)
  {
      sum += nums[i];

      map.putIfAbsent(sum,0);

      if(map.containsKey(sum - k)){
          count += map.get(sum - k);
      }

      map.put(sum, map.get(sum) + 1);
  }

  return count;
}
