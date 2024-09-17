// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//In the code below, we are trying to use a hashmap to store the current sum and the count of how many times we have seen this sum.
//We use a compliment to check in the hashmap which is basically the difference of the current sum and the target.
//If the compliment already exists we increment the counter and add the current sum to hashmap with the count increased
//the count tells us the numbers of subarrays we can have with the current compliment and the currentsum
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0;
        int currentSum = 0;
        int compliment = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int x : nums)
        {
            currentSum = currentSum + x;
            compliment = currentSum - k;
            
            if(map.containsKey(compliment))
            {
                count = count + map.get(compliment);
                
            }
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
     return count;   
    }
}