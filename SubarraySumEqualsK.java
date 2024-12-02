//Time complexity: O(n^2)
//Space complexity: O(1)
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        //We will pick a start index and interate through continuous elements in the array until sum of elements == equal
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if(sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}