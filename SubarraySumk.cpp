// Time Complexity :O(n) 
// Space Complexity : O(n)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Use the running sum and check for (rSum-k) in HashMap ,if present then there is a subarray whose sum is K
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> hMap;
        int count = 0;
        int rSum = 0;
        hMap[0] = 1;
        for(int i =0;i<nums.size();i++){
            rSum+= nums[i];
            if(hMap.find(rSum-k) != hMap.end()){
                count+=hMap[rSum-k];
            }
                hMap[rSum]++;
        }
        return count;
    }
};