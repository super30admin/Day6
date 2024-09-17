// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        int currSum = 0;
        
        hashMap.put(0,1);
        
        for(int i : nums) {
            currSum += i;
            int compliment = currSum-k;
            
            if(hashMap.containsKey(compliment)) 
                count += hashMap.get(compliment);
            
            hashMap.put(currSum, hashMap.getOrDefault(currSum,0) + 1);
        }
        return count;
    }
}