/**
Time complexity: O(n)
Space complexity: O(n)
Executed on Leetcode: Yes
Any problems faced: No
*/

class Solution {
    /**
    Approach:
    - Initialize hashMap, count and currentSum.
    - Add (0,1) to the hashMap to start with.
    - Track the currentSum for every iteration and compute the compliment.
    - Check if the hashMap contains key as the compliment
      If it does, increment the count with the hashMap.get(compliment)
    - Check if the hashMap contains the currentSum as the key
      If it does, increment its value by 1.
      If not, add it into the hashMap.
    - Finally, return the count.
    */
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int count = 0;
        int currentSum = 0;
        
        hashMap.put(0,1);
        
        for(int i=0; i<nums.length; i++) {
            currentSum += nums[i];
            int compliment = currentSum - k;
            
            if(hashMap.containsKey(compliment)) {
                count += hashMap.get(compliment);
            }
            
            if(hashMap.containsKey(currentSum)) {
                hashMap.put(currentSum, hashMap.get(currentSum) + 1);
            } else {
                hashMap.put(currentSum, 1);
            }
        }
        return count;
    }
}
