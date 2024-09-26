/ Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int ls = 0;
        int sum = 0;
        
        unordered_map<int, int> umap;
        umap.insert({0,1});
        
        for(int i = 0; i < nums.size(); i++) {
            sum += nums[i] == 0 ? -1 : 1;
            
            if (sum == 0) {
                if (ls < i + 1) 
                    ls = i + 1;
            } else if (umap.find(sum) != umap.end()) {
                if (ls < i - umap[sum]) 
                    ls = i - umap[sum];
            } else 
                umap[sum] = i;
        }
        
        return ls;
    }
};
