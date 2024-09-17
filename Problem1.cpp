// Time Complexity : O(n)
// Space Complexity : O(n) extra space used in the form of Hash Map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include<iostream>
#include<vector>
#include<unordered_map>

using namespace std;

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> m1;
        int runSum = 0;
        int ctr = 0;
        m1.insert({0,1});   // edge case taking in the left grouping
        for(int i = 0; i < nums.size(); i++){
            runSum = runSum + nums[i];
            if(m1.find(runSum - k) != m1.end()){
                ctr = ctr + m1[runSum - k]; // add to existing sum 
            }

            if(m1.find(runSum) != m1.end()){
                m1[runSum] = m1[runSum] + 1;
            }
            else{
                m1[runSum] = 0 + 1; // if value not mapped to corresponding running sum add 0
            }
        }

        return ctr;
    }
};