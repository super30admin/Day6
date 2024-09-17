// TC: O(n)
// sc: O(1)

// Approach:
//   Used running sum technique. Initially take hashmap which stres running sum and index. 
//   If element at index i is 1 then incremented running sum by 1 else decremented by 1 
//   and checked whether running sum exists in hashmap or not.
//   If exists then find the difference between current index i and value stored in hashmap (values in hashmap is the first values stored while traversing)

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        
        int rsum = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {
                rsum++;
            } else {
                rsum--;
            }
            
            if(hm.containsKey(rsum)) {
                maxLength = Math.max(maxLength, i-hm.get(rsum));
            } else {
                hm.put(rsum, i);
            }
        }
        if(maxLength == Integer.MIN_VALUE) {
            return 0;
        }
        return maxLength;
    }
}
