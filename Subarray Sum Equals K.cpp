// Subarray Sum Equals K
// Approach: maintain a hash map for prefix sum and the number of times the sum has occured as value. if (preSum-k) is in the map, it means there is an index from where the sum is k till curr element. also, if (preSum-k) is 0 then the sum till now is k from 0th index.
// Time: O(n)
// Space: O(n)

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> umap;
        int preSum = 0;
        int result = 0;
        for(int i : nums) {
            preSum += i;
            if(umap.find(preSum-k) != umap.end()) {
                result += umap[preSum-k];
            }
            if((preSum-k) == 0) {
                result++;
            }
            
            umap[preSum]++;
            
        }
        return result;
    }
};