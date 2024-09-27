// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        if(nums.empty() || nums.size() == 0){
            return 0;
        }
        unordered_map <int, int> map;
        int cnt = 0;
        int maximum = 0;
        map[0] = -1;
        for(int i=0; i<nums.size(); i++){
            if(nums[i] == 0)
                cnt = cnt - 1;
            else
                cnt = cnt + 1;
            if(map.find(cnt) == map.end())
                map[cnt] = i;
            else
                maximum = max(maximum, i - map[cnt]);
        }
        return maximum;
    }
};
