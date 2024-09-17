// Time Complexity - O(n) - Since we iterate over the vector nums once.
// Space Complexity - O(n), since we can have a different running sum at all indexes if all elements are different.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> map;
        int rSum = 0;
        map[0] = 1;         // dummy value put to ensure that I don't miss any solutions.
        int size = nums.size();
        int answer = 0;
        int mVal;
        for(int i = 0; i < size; i++){
            rSum += nums[i];
            if(map.count(rSum - k))   // check if 'rSum - k' has occured before. If it has increment answer by value of 'rSum - k' key.
                answer += map[rSum-k];
            if(map.count(rSum))
                map[rSum]++;
            else
                map[rSum] = 1;
        }
        return answer;
    }
};


// Slightly different approach where I dont have to put a dummy value in my map.
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> sumMap;
        int answer = 0;
        int sum = 0;
        int size = nums.size();
        
        for(int i = 0; i < size; i++){
            sum += nums[i];
            if(sum == k)
                answer++;
            
            if(sumMap.find(sum-k) != sumMap.end())
                answer += sumMap[sum - k];
            
            if(sumMap.find(sum) != sumMap.end())
                sumMap[sum]++;
            else
                sumMap[sum] = 1;
        }
        return answer;
        
    }
};
