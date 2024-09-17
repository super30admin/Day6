// Time Complexity - O(n). Since we have to iterate over all the elements in our nums vector.
// Space Complexity - O(n). Since we can have a different sum at all indexes if we have all 1s in our vector. Is my answer correct?
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int, int> map;
        map[0] = -1;        // dummy value entered to not miss the first answer
        int size = nums.size();
        int rSum = 0;
        int answer = 0;
        
        for(int i = 0; i < size; i++){
            if(nums[i] == 0)
                rSum--;
            else
                rSum++;
            // if(map.find(rSum) != map.end())
            //     answer = max(answer, i - map[rSum]);
            if(map.count(rSum))     // checks if the key'rSum' is present in the map.
                answer = max(answer, i - map[rSum]);
            else
                map[rSum] = i;
        }
        return answer;
    }
};
