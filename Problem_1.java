// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


class Solution {
    public int subarraySum(int[] nums, int k) {
        
        //edge case
        if(nums.length == 0 || nums == null) return 0;
        
        int count =0;
        int rSum = 0;
        
        // key = running sum, value = number of occurrence
        Map<Integer,Integer> myMap = new HashMap<>();
        
        //0 running sum has occured 1 time
        myMap.put(0,1);
        
        // iterate through the array
        for(int i=0;i<nums.length;i++){
            
            // calculate the running sum
            rSum += nums[i];
            
            // calculate the compliment
            int compliment = rSum - k;
            
            // if compliment is found, get value of key and add it to count
            if(myMap.containsKey(compliment)){
                count += myMap.get(compliment);
            }
            
            // rsum found as key add rSum, add 1 to value
            if(myMap.containsKey(rSum)){
                myMap.put(rSum,myMap.get(rSum)+1);
            }else{
                // just add rSum has occured only once
                myMap.put(rSum,1);
            }
            
        }
        
        return count;
        
    }
}