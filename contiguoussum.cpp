//Time Complexity : O(n)
//Space Complexity: O(n)
//Did this code successfully run on Leetcode : Yes

//Approach
// Calculate running sum for all where running sum is-1 if nums[i] is 0 else 1
// If map has key runningsum already set result as max of result, i - map[runningsum]
// else set map[runningsum] = i

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int, int> map;
        int rSum = 0; 
        map[0] = -1;
        int result = 0; 
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == 0){
                rSum -= 1;
            }else{rSum += 1;}
            if(map.find(rSum) != map.end()){
                result = max(result, i - map[rSum]);
            }else{
                map[rSum] = i; 
            }
        } 
        return result;
    }
};