class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int count=0;
        int max_length=0;
        hmap.put(0,-1); // 
        
        for(int i=0; i<nums.length; i++){
            // Counting number of unbalanced 1's
            count = nums[i]==0? count-1 : count+1;
            
            if(!hmap.containsKey(count)) // Adding the first index of unbalanced count of 1's
            {
                hmap.put(count, i);
            }
            else // If the count is already present, then we found some balanced length of 1 & 0 
                max_length = Math.max(max_length, i-hmap.get(count)); // Getting length and storing max_length
        }
        return max_length;
    }
}

// TC-  O(N)
// SC- O(N)
/* Logic-
- We can store the count of unbalanced 0's or unbalanced 1's in a hashmap
- When we get equal number of 1's and 0's, we reach to already stored count of unbalanced 1's.
- Therefore, the difference between the first unbalanced count index and current index should be the length of balanced binary array that we are looking for
- Using, max function we store the maximum such length
*/   
