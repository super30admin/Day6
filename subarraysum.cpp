// Time Complexity : O(n)
// Space Complexity : O(n) in worst case stroing all prefix sums in hashmap
// Did this code successfully run on Leetcode : Yes

// //Approach:
// Calculate runningSum at each index. 
// Check if hashmap has the compliment already. If it does  add to that value. 
// Increment occurance

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int rSum = 0; 
        unordered_map<int, int> map;
        int count = 0; 
        map[0] = 1;

        for(int i = 0; i < nums.size(); i++){
            rSum += nums[i];
            if(map.find(rSum - k) != map.end()){
                count += map[rSum - k];
            }
            map[rSum]++;
        }
        return count;
    }
};