//The approach here is to have running sum at each index and see it that occurred previously. 
//Here, the conditions for running sum is if value is 0, we decrease the running sum by 1 and if it is 1, then we increase the running Sum by 1.
//We store the earliest running sum occurence in a hashmap to get the longest contiguous array.
//The special case is adding running sum 0 at index -1, to capture the scenario where the whole array is contiguous.
//Time Complexity: O(n) for traversing the array
//Space Complexity: O(1) because we have max length of 2000.
import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int longest = 0;
        int rSum = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1) rSum++;
            else rSum--;
            if(!map.containsKey(rSum)){
                map.put(rSum, i);
            } else {
                longest = Math.max(longest, i-map.get(rSum));
            }
        }
        return longest;
    }
}
