/* 
Complexity: Time O(N) and Space O(N)

Passed All Test Cases 

Solution: We use hashmap to keep track of the sum and check to see if the sum - target exists, that is basically checking if the array till the current index (from the last valid array index) makes the target or not. 


*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0 ; 
        int count = 0 ; 
        HashMap<Integer, Integer> map = new HashMap<>() ; 
        map.put(0, 1) ; 
        for (int i = 0 ; i < nums.length ; i++) {
            sum += nums[i] ; 
            int rest = sum - k ;  
            if (map.containsKey(rest)) {
                count += map.get(rest) ; 
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1) ; 
        }
        
        return count ; 
    }
}