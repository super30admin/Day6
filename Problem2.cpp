// Time Complexity : O(n)
// Space Complexity : O(n) extra space used in the from of hash map 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include<iostream>
#include<vector>
#include<unordered_map>

using namespace std;

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        if(nums.empty())
            return 0;
        
        unordered_map<int, int> m1;
        m1.insert({0, -1}); // handling edge case left-most pair 
        int runSum = 0;
        int max = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == 0){
                --runSum;
            }
            else{
                ++runSum;
            }

            if(m1.find(runSum) != m1.end()){
                int currLen = i - m1[runSum];       // if it exists then use X - Y = Z approach 
                if(currLen > max){
                    max = currLen;
                }
            }else{
                m1.insert({runSum, i});
            }
        }
        return max;
    }
};