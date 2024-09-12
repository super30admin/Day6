// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : no failing some test cases
// Any problem you faced while coding this : yes

//Tried saving the count of zeroes and ones
// but could not achieve correct solution. I am trying to save the counts
//and take min for each index but what if they are not continuous is where I'm stuck

class Solution {
    public int findMaxLength(int[] nums) {

        int[][] arr = new int[nums.length][2];
        int zero = 0;
        int one = 0;
        int maxLen = 0;
        boolean found = false;
        int all = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                zero += 1;
                arr[i][0] = zero;
                arr[i][1] = one;
            }
            else
            {
                one += 1;
                arr[i][1] = one;
                arr[i][0] = zero;
            }

        }

        for(int j = 0; j < arr.length; j++)
        {
            // if(arr[j][0] == arr[j][1]){
            //     found = true;
            //     maxLen = Math.max(maxLen, 2 * Math.min(arr[j][0], arr[j][1]));
            // }
            // all = Math.max(maxLen, 2 * Math.min(arr[j][0], arr[j][1]));
            if(j == arr.length -1 && 2 * Math.min(arr[j][0], arr[j][1]) > maxLen){
                if(arr[j][0] != arr[j][1]){
                    return maxLen;
                }
            }

            maxLen = Math.max(maxLen, 2 * Math.min(arr[j][0], arr[j][1]));

        }

        // if(found == true){
        //     return maxLen;
        // }

        return maxLen;
    }
}

//correct solution using rolling sum based on what was taught in class.
/*
time complexity : O(N) where N is the length of the input SubArraySumsEqualK
space complexity : O(N) worst case all are 1s and we have to save
                  increasing  sum as key
*/
public int findMaxLength(int[] nums)
{
  int max = Integer.MIN_VALUE;

  Map<Integer, Integer> firstSeen = new HashMap<>();

  firstSeen.put(0,-1);

  int sum = 0;

  for(int i = 0; i < nums.length; i++)
  {
      sum += nums[i] == 1 ? 1 : -1;

      firstSeen.putIfAbsent(sum,i);

      int index = firstSeen.get(sum);

      if(max < i - index)
          max = i - index;
  }

  return max;
}
