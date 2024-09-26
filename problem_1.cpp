/ Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        if (nums.size() == 0) return -1;
    
        int ps = 0;
        int ex = 0;
        int ctr = 0;
        unordered_map<int, int> umap;
        umap.insert(make_pair(0 , 1));
        
        for (int n : nums) {
            ps += n;
            ex = ps - k;
            if (umap.find(ex) != umap.end()) {
                ctr += umap[ex];
            }
            umap[ps]++;
        }
        return ctr;
    }
};
