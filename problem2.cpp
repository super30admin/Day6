/*
Time complexity - O(N)
Space complexity - O(N)
*/
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        if (nums.size() == 0) return 0;
        unordered_map<int,int> umap;
        int runSum = 0, res = 0;
        umap[0] = -1;
        for (int i = 0; i < nums.size(); ++i){
            if (nums[i] == 1) ++runSum;
            else --runSum;
            if (umap.count(runSum) == 0){
                umap[runSum] = i;
            }
            else{
                res = max(res, i - umap[runSum]);
            }
        }
        return res;
    }
};