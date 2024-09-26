/*
TIme complexity - O(N)
Space complexity - O(N)
*/
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        if (nums.size() == 0) return 0;
        unordered_map<int,int> umap;
        umap[0] = 1;
        int cnt = 0, runSum = 0;
        for (int i = 0; i < nums.size(); ++i){
            runSum += nums[i];
            if (umap.count(runSum - k) != 0) {
                cnt += umap[runSum - k];                
            }
            ++umap[runSum];
        }
        return cnt;
    }
};