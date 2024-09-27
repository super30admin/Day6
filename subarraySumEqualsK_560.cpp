// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        if(nums.empty() || nums.size() == 0){
            return 0;
        }
        int cnt = 0;
        unordered_map<int, int> map;
        int rsum = 0;
        map[0] = 1;
        for(int i=0; i<nums.size(); i++){
            rsum += nums[i];
            int diff = rsum - k;
            if(map.find(diff) != map.end()){
                cnt += map[diff];
            }
            if(map.find(rsum) == map.end()){
                map[rsum] = 1;
            }
            else{
                map[rsum] = map[rsum] + 1;
            }
        }
        return cnt;
    }
};
