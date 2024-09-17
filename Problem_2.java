// Time : O(n)
//Space: O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums == null){
          return 0;
        }
      
      int currSum = 0;
      HashMap<Integer,Integer> hmap = new HashMap<>();
      int maxCount = 0; // should be 0, and not Integer.MIN_VALUE as if there is no equal number of 0s and 1s in array, return this max as it is.
      
      hmap.put(0,-1); // to begin with, current sum = 0, at index -1
      
      for(int i=0;i<nums.length;i++){
          if(nums[i] == 1){
            currSum -= 1;
          }
        else{
          currSum += 1;
        }
        
        if(hmap.containsKey(currSum)){ // if current sum repeats, that means the 1's and 0's are equal in number, (theory: length can be obtained from end-start+1) 
          int startIndex = hmap.get(currSum);
          int end = i;
            maxCount = Math.max(maxCount,end-startIndex); // we dont really need end-start+1, as we can consider just length of the subarray where 1's and 0's are equal in number, omitting one of the border indexes
        }
        else{
          hmap.put(currSum,i);
        }
        
      }
      return maxCount;
    }
}
