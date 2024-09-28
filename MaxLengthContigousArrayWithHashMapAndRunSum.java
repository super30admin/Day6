// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//Implementing hashmap with  Running sum pattern/cumulative sum pattern

//Initially running sum is zero
//1 is given value 1 and 0 is given value -1
//when i encounter 1,i will add 1 and for zero -1

//running sum mean Going on & calculating the sum of element


//in hashmap going to keep track of running sum and the index at which it first occured
//initilaize running sum as 0 happened at index -1


class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length ==0)
            return 0;
        
        Map<Integer, Integer> sumMap = new HashMap<>();
        //Initializing hashmap with 0 & -1
        sumMap.put(0,-1);
        int rSum = 0, maxLen = 0;
        int start = 0 , end = 0;
        
        for(int i =0; i < nums.length; i++) {
            //Calculate running sum
            rSum = (nums[i] == 0)? rSum-1: rSum+1;
            
            //check if rSum exists in map
            if(! sumMap.containsKey(rSum)){
                sumMap.put(rSum, i);
            }
            else {
                //maxlength <> existing value
                if(maxLen <= i - sumMap.get(rSum)) {
                    end = i;
                    start = sumMap.get(rSum)+1;
                }
                maxLen = Math.max(maxLen, i - sumMap.get(rSum));
            }
        
        }
        return maxLen;
    }
}






