// Time Complexity: O(n)
// Space complexity: O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Here we will be using map to store the previous sums which we have got and then after finding the new one we will be searching for the one which will be formed by subtracting this sum from k (if that exists that means we have got the subarray else we will only store the value of this new sum in the map.
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int rSum = 0;
        int result = 0;
        unordered_map<int, int> map;
        // we put frequency of 0 as 1 as we have rSum = 0, to encounter the first subarray with sum = k
        map[0] = 1;
        for(int i = 0; i < nums.size(); i++) {
            rSum += nums[i]; // running sum
            // checking if rSum - k exists in hashmap, then add the no of times the value exists
            if(map.find(rSum - k) != map.end()) result += map[rSum - k];
            // increase the frequency, since we are counting frequency
            map[rSum]++;
        }
        return result;
    }
};