// Contiguous Array
// Approach: maintain a hash map of prefix sum is to index. also keep a var for prefix sum. whenever prefix sum is 0, we can update the result from 0th index to the curr index. also, if we encounter the same prefix sum in the map, then update result as max(result, difference of indices). else, put the prefix in map.
// Time: O(n)
// Space: O(n)

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int,int> umap;
        int preSum = 0;
        int result = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] == 0) {
                preSum -= 1;
            }
            else {
                preSum += 1;
            }
            if(preSum == 0) {
                result = i+1;
            }
            else if(umap.find(preSum) != umap.end()) {
                result = max(result, (i-umap[preSum]));
            }
            else {
                umap[preSum] = i;
            }
        }
        return result;
    }
};

