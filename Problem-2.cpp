//https://leetcode.com/problems/contiguous-array/

// Time Complexity : O(n)
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// The sum variable is reduced by 1 if we encounter 0 or increase by 1 in the case of 1.
// In the hashmap store the sum so far and the index associated with it.
// If sum is zero then the max lenght is index+1, else if the sum is already existing in the map then we need to reduce the current index with that value's index
// else just store the sum


class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int,int>mp;
        int sum=0;
        int maxLen = 0;
        for(int i=0; i<nums.size(); i++){
            sum += nums[i] == 0? -1 : 1;
            if(sum == 0){
                maxLen = i+1;
            }
            else if(mp.find(sum) != mp.end()){
                maxLen = max(maxLen, i-mp[sum]);
            }
            else{
                mp[sum] = i;
            }
        }
        return maxLen;
    }
};