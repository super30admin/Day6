// idea is
// we want to maintain a hashmap
// everytime we encounter 0, we subtract -1
// everytime we encounter 1, we add 1
// we insert into hashmap key as count value as index
// time complexity: O(n)
// works on leet code
class Solution {
    public int findMaxLength(int[] nums) {
     
 
        HashMap<Integer, Integer> countIndexMap = new HashMap();
        
        // intialize map with count 0, index -1
        countIndexMap.put(0, -1);
        int longest = 0;
        int count = 0;
        
        for (int index=0; index < nums.length; index++) {
            
            if (nums[index]== 0) count += (-1);
            else if (nums[index]==1) count += 1;
            
            // if count == 0, we crossed over
            // so update longest
            if (count == 0) {
                longest = (index+1);
            }
            
            if (countIndexMap.get(count) != null) {
                // map contains key, update longest
                longest = Math.max(longest, index - countIndexMap.get(count));                
            } else {
                // map doesn't contain key..so add it to hashmpap
                countIndexMap.put(count, index);
            }
            
        }
        return longest;
    }
}
