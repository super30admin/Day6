// Problem 1: Subarray Sum Equals k
// Time Complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int subarraySum(int[] nums, int k) {
        //Initializing current sum and counter to 0
        int currSum = 0;
        int count = 0;
        
        //Declaring a hashMap to store Current sum and how many times we invoked current sum
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        //Adding initial sum to hashmap
        hashMap.put(0,1);
        
        //Loop through the array
        //calculate current sum and comliment
        for(int x : nums){
            currSum += x;
            int compliment = currSum - k;
            
            //if compliment is already present in the hashmap
            //increment the counter by the value stored for the compliment in hashMap
            if(hashMap.containsKey(compliment)){
                count+= hashMap.get(compliment);
            }
            
            //add or update the current sum and its occurance in hashMap
            hashMap.put(currSum, hashMap.getOrDefault(currSum,0)+1);
        }
        
        //return counter
        return count;
    }
}

