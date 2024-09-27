// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : the concept 


// Your code here along with comments explaining your approach

class Solution {
    //Init
    //for loop check compliment
    // -> if present add to count
    //-> else do nothing
    
    //check for currSum in HashMap
    //      -> if present ++
    //          -> else add
    
    //TC: O(n) for one traversal of the entire array
    //SC: O(n) for HashMap
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int count = 0;
        int currSum = 0;
        
        hashMap.put(0,1);
        
        for(int i : nums){
            currSum += i;
            int compliment = currSum - k; //check compliment
            
            if(hashMap.containsKey(compliment))
                count += hashMap.get(compliment);
            
            hashMap.put(currSum, hashMap.getOrDefault(currSum, 0) + 1);
            
        }
        
        return count;
        
    }
}