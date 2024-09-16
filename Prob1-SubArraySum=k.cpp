// Time Complexity : O(N) where N is the number of element in the given array;
// Space Complexity :O(N) N is the total no of elements in the array. we are using map to store the prefix sum
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :I used 2 pointers with sliding window approach but that would fail with -ve no



// Your code here along with comments explaining your approach

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
    int prefixSum = 0;
    unordered_map<int,int>umap;//mapping prefSum to counter;
    int result = 0;
    umap[0]++;
    for(int i = 0; i < nums.size();i++){
        prefixSum += nums[i];
        result+=umap[prefixSum-k];
        umap[prefixSum]+=1;
    }
    return result;

    }
};



