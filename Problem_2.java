// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        
        // edge case
        if(nums.length == 0 || nums == null) return 0;
        
        Map<Integer,Integer> myMap = new HashMap<>(); // running sum : index
        
        // running sum is 0 at -1 index, edge case to handle [0,1,.....]
        myMap.put(0,-1);
        int count = 0;
        int rSum = 0;
        
        // iterate over the array
        for(int i=0;i<nums.length;i++){

            // if element is 0 -1 rsum else +1 rsum
            if(nums[i]==0){
                rSum += -1;
            }else{
                rSum += 1;
            }
            
            // if map contains key rsum
            if(myMap.containsKey(rSum)){

                // get value of rsum
                int sIndex = myMap.get(rSum);
                // count will be max of previous count and current index - sIndex
                count = Math.max(count,i-sIndex);
            }else{
                // put rsum and index into map
                myMap.put(rSum,i);
            }
            
        }
        
        
        return count;
        
    }
}