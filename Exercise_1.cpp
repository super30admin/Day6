// Time Complexity                              :  O(N)
// Space Complexity                             :  O(N) 
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  


class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int sum = 0, count = 0, n = nums.size();
        unordered_map<int,int> mp;
        for(int i=0;i<n;i++){
            mp[sum]++;
            sum += nums[i];
            if(mp.find(sum - k) != mp.end()) count += mp[sum-k];
        }
        return count;
    }
};