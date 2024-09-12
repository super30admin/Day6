/**

TC - O(n) for modifying an array + O(n) for iteration.
SC - O(n) where n is the extra space that is being used by an array.


// Thought process buildup
nums = [0,1,0]

0,1,0 = 3
0,1 = 2
0,1,0
1,0 = 2

O(n)


 O(n^2)
 
 O(n)
 
 0,1,0 -> 
 
 T = 0
 
-1 1 -1
 0 -1 0 -1

Map prefix -> freq
 -1,1
  0 -1
  
  0 -> 2
  -1 -> 1
  
  0 1 0 1
  -1 1 -1 1
  0 -1 0 -1
  
  1 2

0- [s,e]
-1 [s,e]
0 []

**/
class Solution {
    public int findMaxLength(int[] nums) {
        
        // Modify the array with -1 inplace of zero
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] == 0)
            {
                nums[i] = -1;
            }
        }
        
        Map<Integer, Integer> prefixtoFreq = new HashMap<>();
        prefixtoFreq.put(0,0);
        int prefixSum = 0;
        int result = 0;
        
        for (int i=0; i<nums.length; i++)
        {
            prefixSum += nums[i];
            
            int diff = prefixSum - 0;
            
            if (prefixtoFreq.containsKey(diff))
            {
                result = Math.max(result, (i - prefixtoFreq.get(diff)) + 1);
            }
            else
            {
                prefixtoFreq.put(prefixSum, i + 1);
            }
        }
        
        return result;
    }
}
















