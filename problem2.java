/*

Complexity : Time and Space O(N), N is the number of elements 

Passed All Test Cases 

For every Zero we add -1 and +1 for every 1. Then we keep track of the zero sum and subtract the current index from the first existence of the zero. 
This gives us the length of the array 



*/ 


class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0 ; 
        int sum = 0 ; 
        HashMap<Integer, Integer> map = new HashMap<>() ; 
        map.put(sum, -1) ; 
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 0) sum-- ; 
            else
                sum++ ; 
            if(map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum)) ; 
            } else map.put(sum , i) ; 
        }
        
        return maxLength ; 
    }
}