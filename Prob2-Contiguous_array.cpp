// Time Complexity : O(N) where N is the number of element in the given array;
// Space Complexity :O(N) N is the total no of elements in the array.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No



// Your code here along with comments explaining your approach

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int running_sum = 0;
        int max_len = 0;
        unordered_map<int,int>umap;
        umap[0]=-1;
        for(int i = 0; i < nums.size();i++){
            if(nums[i]==0)running_sum+=-1;
            else running_sum +=1;
            if(umap.find(running_sum)!= umap.end()){
                max_len = max(max_len,i - umap[running_sum]);
            }
            else umap[running_sum]=i;
        }
        return max_len;
    }
};