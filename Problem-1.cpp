// https://leetcode.com/problems/subarray-sum-equals-k/

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// use a hashmap that stores the sum of elements at each index and the frequency.
// Initialize the hashmap with key = 0, val = 1, for the case when the first element of the array is equal to k.
// Take the sum of the element at each index, check if the differece( sum - k) is already present, if yes then increment the count. 


class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        mp[0] = 1;
        int count=0; int sum = 0;
        for(int i=0; i<nums.size(); i++){
            sum += nums[i];
            int diff = sum - k;
            count += mp[diff];
            mp[sum] += 1;
        }
        return count;
    }
};