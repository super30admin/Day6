// Time Complexity : O(n) - n is the length of sequence. Unordered map is O(1) for lookup and insertion and worst case O(n). So O(n)+O(n) == O(n)
// Space Complexity : O(n) - We use a map that can be the very large depending on the sequence
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        if(nums.size() == 0) return 0;
        int count = 0;
        unordered_map<int, int> tracker; //track the occurances of that sum
        int runningSum = 0;
        tracker[runningSum] = 1;
        for(int i = 0; i < nums.size(); ++i){
            runningSum+=nums[i];
            if(tracker.find(runningSum - k)!=tracker.end()){
                count+=tracker[runningSum - k];//Check if the compliment has occured before. If it has, then the difference will always be K and it is a subarray
            }
            if(tracker.find(runningSum) == tracker.end()){
                tracker[runningSum] = 1;

            }
            else{

                 tracker[runningSum]+= 1;
            }
            
        }
        return count;
    }
};