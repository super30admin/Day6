// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int len = 0;
        int sum = 0;
        unordered_map<int, int> mp;
        mp[0] = -1;
        for (int i=0; i<nums.size(); i++) {
            if (nums[i] == 0){
                sum-=1;
            }
            else sum+=1;
            if (mp.find(sum)!= mp.end()) {
                len = max(len, i-mp[sum]);
            }
            else mp[sum] = i;
        }
    return len;
    }
};