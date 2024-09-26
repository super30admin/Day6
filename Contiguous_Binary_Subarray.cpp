//ContiguousBinaryArray.cpp : This file contains the 'main' function. Program execution begins and ends there.

/*
Approach - Maintain hashmap of sum and index. Add basecase of sum=0, index=-1;
           keep adding 1 to sum if nums[i] is 1 and subtract 1 from sum if                  nums[i]=0. Check if sum exists in hashmap, if so, find maximum between            maxlength(initialize to zero) and index - corrsponding to sum value in            hashmap.
->Two base conditions to check
        1) if sum==0, means equal number of 0's and 1's hence sum is nullified.              (base case add [0, -1] to hash map)
        2) if sum already exists then we have encountered equal number of 1's and            0's starting from first available sum index to recent available sum              index. (excluding starting index = i-hashmap[sum]) - **graph
        
        [0,1,0,1,1,1,1,0,0,1,0] nums
        [-2,-1,-2,-1,0,1,2,1,0,1,0] sum
*/

//Time Complexity - O(N) - N being size of nums array
//Space Complexity - O(N)

#include <iostream>
#include <algorithm>
#include <vector>
#include <unordered_map>

using namespace std;


class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int, int> tracker; //<sum, index>
        int sum = 0, maxLength = 0;
        //base case
        tracker[0] = -1;
        //iterate over nums
        for (int i = 0;i < nums.size();i++) {
            sum = sum + (nums[i] == 1 ? 1 : -1);
            if (tracker.find(sum) == tracker.end()) {
                tracker[sum] = i;
            }
            else
                maxLength = max(maxLength, i - tracker[sum]);
        }
        return maxLength;
    }
};


/*
Brute force approach
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int maxlength=0;
        for(int i=0;i<nums.size();i++){
            int ones=0, zeroes=0,  k=0;
            for(int j=i;j<nums.size();j++){
                if(nums[j]==1)
                    ones++;
                else
                    zeroes++;
                k++;
                if(zeroes==ones)
                    maxlength=max(maxlength,j-i+1);
            }
        }
        return maxlength;
    }
};*/

int main()
{
    vector<int> nums = {0,1,1,0,1,1,1,1,0};
    Solution s;
    std::cout << s.findMaxLength(nums);"\n";
}


