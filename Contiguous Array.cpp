// Time Complexity: O(n)
// Space complexity: O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int rSum = 0, maxLength = 0, start = 0;
        int end = 0;
        unordered_map<int, int> map;
        // for taking care of the edge case where start of occurence of running sum = 0 is stored at -1 
        map[0] = -1;
        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] == 0) rSum--;
            else rSum++;
            if(map.find(rSum) != map.end()) {
                if(maxLength < (i - map[rSum])) {
                    maxLength = (i - map[rSum]); // length of subarray
                    start = map[rSum] + 1; // visualize the pattern
                    end = i;
                }
            }
            else map[rSum] = i;
        }
        return maxLength;
    }
};