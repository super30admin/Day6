// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    We store the different Running Sums which are possinle in a Map.
    We store the minimum index at which that particular Running Sum was formed. 
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        int count = 0;
        int rSum = 0;
        for (int i : nums){
            rSum +=i;
            if (hashMap.containsKey(rSum-k)) count += hashMap.get(rSum-k);
            hashMap.put(rSum,hashMap.getOrDefault(rSum,0)+1);
        }
        return count;
    }
}