//Problem2 - https://leetcode.com/problems/contiguous-array/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int rSum = 0;
        int maxLen = 0;
        unordered_map<int, int> hmap;
        hmap.insert({0,-1});
        for(int i=0;i<nums.size();i++){
            // increase or decrease rSum depending on conditions of 0 and 1
            if(nums[i] == 0){
                rSum--;
            }else{
                rSum++;
            }
            //check if rSum is there in the map and calculate index
            if(hmap.find(rSum) != hmap.end()){
                maxLen = max(maxLen, i - hmap[rSum]);
            }else{
                hmap[rSum] = i;
            }
        }
        return maxLen;
    }
};