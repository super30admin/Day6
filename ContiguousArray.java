public class ContiguousArray {
  /**

    Problem: https://leetcode.com/problems/contiguous-array/

    Use the running sum approach. We can maintain a running sum on a variable `sum = 0` and 
        incrementing it +1 when we encounter a 1 in array
        decrementing by -1 when we encounter a 0 in array.
    
    Using Running sum approach, i.e. maintaining the cummulative sum at each index,
     I would know the array the balanced between 2 indices when the sum is the same between those 2 indices.
     
     Maintain a map of Sum and the index at which it occured last (since we need the maximum length).

   * Time Complexity: O(n)
   * Space Complexity: O(1)

   * Did this code successfully run on Leetcode : Yes
   * Any problem you faced while coding this : No 
  
  */
    public int findMaxLength(int[] nums) {
      Map<Integer, Integer> map = new HashMap<>();
      
      int running_sum = 0;
      int max_length = 0;
      map.put(0, -1); //Need to add this so we include the maximum length occuring from the first index.
      for(int i = 0; i < nums.length; i++) {
          running_sum += (nums[i] == 1) ? 1 : -1;
          
          if(map.containsKey(running_sum)){
              int length_balanced_array = i - map.get(running_sum); // Current length of balanced array we found.
              
              max_length = Math.max(max_length, length_balanced_array);
          } else {
              map.put(running_sum, i);
          }
      }
      return max_length;
  }
  
}
