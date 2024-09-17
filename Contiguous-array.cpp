// Time Complexity :O(n) 
// Space Complexity : O(n)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Use rSum to maintain a balanced array, i.e if rSum is same that means there is equal number of 1's and 0's

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int count = 0;
        unordered_map<int,int> hMap;
        int rSum = 0;
        hMap[0] = -1;
        for(int i=0;i<nums.size();i++){
            rSum = nums[i] == 0 ?rSum -1:rSum + 1;
            if(hMap.find(rSum) != hMap.end()){
                count = max(count,i - hMap[rSum]);
            }
            else{
                hMap[rSum] = i;
            }
        }
        return count;
    }
};