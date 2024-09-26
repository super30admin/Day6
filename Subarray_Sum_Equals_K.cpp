// Subarray_Sum_Equals_K.cpp : This file contains the 'main' function. Program execution begins and ends there.
/*
base case: sum = 0, numer of subarrays = 1 (if sum==0, then null array)
Approach - Create hashmap to maintain sum and count of subarrays.
           Add base case <0,1> to hashmap. iterate over each number in array, add 
           current elemnt to sum and check if difference (sum-k) is present in    
           hashmap. If yes, add its value to count. Finally, check if sum is    
           present in hashmap, and increment its value by 1.

Time complexity: O(N), N vector size
Space complexity: O(N), N vector size
*/

#include <iostream>
#include <algorithm>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> tracker;  //<sum, count of subarrays who sum equals to k>
        int sum = 0, count = 0;
        //base case
        tracker[0] = 1;
        for (int i = 0;i < nums.size();i++) {
            sum += nums[i];
            //first check if sum-k is present in tracker, if yes then add its value to count
            if (tracker.find(sum - k) != tracker.end()) {
                count += tracker[sum - k];
            }
            //check if sum is present in tracker if so increment its value by q
            tracker[sum] = tracker[sum] + 1;
        }
        return count;
    }
};


/*
Brute force approach

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            int sum=nums[i];
            if(sum==k) count++;
            for(int j=i+1;j<nums.size();j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
};*/

int main()
{
    vector<int> nums = { 1,-1,1,3,-3,2,1};
    int k = 3;
    Solution s;
    std::cout << s.subarraySum(nums,k);"\n";
}