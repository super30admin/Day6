// Time Complexity: Traversing only once through the array once, and performing constant operations inside using Map- O(n)
// Space Complexity: Auxilliary Map used which may take length upto length of array O(n)
// Did you complete it at leetcode: Yes
// Any problems faced with this question: Understood in class

// Explain your code here
// Idea here is to check if subarray is balanced by subtracting the sum from 0th index to initial index from sum from 0th index to final index of any particular subarray.
// To perform that we are maintaining a map, in which we check if a particular sum already exists in map? if it doesn't we add it with the index as value to mark as first occurence.
// If that sum value occurs again, it is evident that subarray between the 2 indexes is balance and has sum as 0. length is recorded and compared with current max length.
// To perform summation we increase count value by 1 for each 1 and decrease count value by 1 for each 0.
// finally maximum length obtained is returned.
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLength=0;
        int count = 0;
        for(int i=0; i< nums.length; i++) {
            if(nums[i]==1) {
                count++;
            } else {
                count--;
            }
            if(map.containsKey(count)) {
                maxLength = Math.max(maxLength, i-map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLength;
    }
}