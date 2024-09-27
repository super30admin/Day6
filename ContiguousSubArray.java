// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class ContiguousSubArray {
    public int findMaxLength(int[] nums) {
        int rSum = 0;
        int maxLength = 0;
        Map<Integer, Integer> rSumMap = new HashMap<>();
        rSumMap.put(0, -1); // it is to cover edge cases like [0,1]
        for(int i=0; i<nums.length; i++){
            //Running sum is +1 if 1 is encountered, -1 if 0 is encountered
            rSum += (nums[i] == 1) ? 1: -1;

            //If running sum already exists in the map, difference between current index and previous index will give out the length of equal no of 0's and 1's
            if(rSumMap.containsKey(rSum)){
                maxLength = Math.max(maxLength, i-rSumMap.get(rSum));
            }
            else {
                rSumMap.put(rSum, i); //running sum is added to the map is not present already
            }
        }
        return maxLength;
    }
    public static void main(String args[]){
        int[] intArray = new int[]{0, 1, 1, 0, 0};
        ContiguousSubArray contiguousSubArray = new ContiguousSubArray();
        contiguousSubArray.findMaxLength(intArray);
    }
}

