// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

//lc 560

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int sum = 0;
        map<int,int> mp;
        mp[0] = 1;
        int ans = 0;
        for(auto &x : nums) {
            sum += x;
            if(mp.find(sum-k) != mp.end()) {
                ans += mp[sum-k];
            }
            mp[sum]++;
        }
        
        return ans;
    }
};
