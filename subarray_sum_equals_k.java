// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int subarraySum(int[] nums, int k) {
        int currentSum = 0;
        int count = 0;

        HashMap<Integer, Integer> subArray = new HashMap<>();
        subArray.put(0,1);
        for(int x : nums){
            currentSum += x;
            int compliment = currentSum - k;

            if(subArray.containsKey(compliment)) count += subArray.get(compliment);

            if(subArray.containsKey(currentSum)){
                subArray.put(currentSum, subArray.get(currentSum) + 1);
            }
            else{
                subArray.put(currentSum, 1);
            }
        } return count;
    }
}
// Your code here along with comments explaining your approach
