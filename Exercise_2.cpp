// Time Complexity                              :  O(N)
// Space Complexity                             :  O(N)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  


class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int count=0,n=nums.size();
        if(n==1) return 0;
        unordered_map<int,int> mp;
        mp[0] = -1;
        int max_length = 0;
        for(int i=0;i<n;i++) {
            if(nums[i] == 1) count++; 
            else count--;
            if(mp.find(count) != mp.end()) {
                 int current_length = i - mp[count];
                  max_length = max(max_length,current_length);
            } else {
                mp[count] = i;
            }
            
        }
        return max_length;
    }
};