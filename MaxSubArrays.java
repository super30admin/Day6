// Time Complexity : O(n*2) where n is the length of input array
// Space Complexity : O(1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Could only get the brute force approach right, looking forward to class to see the intuitive approach

//looping through the array and finding the sum of each possible sub array to see if their sum is equal to k

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k) count++;   
            } 
        }
        return count;
    }
}