// Time Complexity : O(n) - n is the length of sequence. Unordered map is O(1) for lookup and insertion and worst case O(n). So O(n)+O(n) == O(n)
// Space Complexity : O(n) - We use a map that can be the very large depending on the sequence
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        if(nums.size() == 0 || nums.size() == 1) return 0;
        int maximum = 0;
        unordered_map<int, int> tracker;
        int runningSum = 0;
        tracker[runningSum] = -1;
        for(int i = 0; i < nums.size(); ++i){
            if(nums[i] == 0)
                runningSum+=-1;
            else
                runningSum+=1;
            if(tracker.find(runningSum)!=tracker.end()){
                maximum = max(maximum, i - tracker[runningSum]);
            }
            else{
                tracker[runningSum] = i;
            }
        }
        return maximum;
    }
};