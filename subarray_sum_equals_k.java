class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int count=0;
        hmap.put(0,1);
        int currSum=0;
        
        for(int i=0; i<nums.length; i++){
            currSum+= nums[i];
            
            if(hmap.containsKey(currSum-k)){
                count+=hmap.get(currSum-k);
            }
            hmap.put(currSum, hmap.getOrDefault(currSum,0)+1);
        }
        
        return count;
    }
}

// TC- O(N) since array is traversed once
// SC- O(N) because hashmap is used to store worst case n entries
/* Logic-
- Instead of getting all the subarrays and then checking if entries exist use hashmap to store sum and the count that sum is obtained for
- Subarray is considered since we calculate continuous sum in currSum variable
- When we go further in nums array, currSum will be obviously more than k since it is cumulative sum
- But if we get currSum-k in hashmap key then a subarray has a sum of k. Hence we take its count and add it in count
- if currSum==k then the hashmap has a default entry (0->1) that increases the count by 1*/
