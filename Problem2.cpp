// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

//lc 525

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int n = nums.size();
        int sum = 0;
        unordered_map<int, int> mp;
        mp[0] = -1;
        int maxLen = 0;
        for(int i=0;i<n;i++) {
            if(nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }
            //map contains sum
            if(mp.find(sum) != mp.end()) {
                int idx = mp[sum];
                int len = i - idx;
                maxLen = max(maxLen, len);
            } else {
                mp[sum] = i;
            }
            
        }
        return maxLen;
    }
};