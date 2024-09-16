// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : Edge case was difficult to understand


// Your code here along with comments explaining your approach

/* 
1. Create a hash map initialize key as 1 and associated value as 1
2. Iterate through the array and update the sum on every iteration
3. When the sum is equal to required k, sum - k = 0. Verify this by checking it with the key which is 0
4. When this is true, update the counter. 
*/

#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) 
    {
        int count = 0;
        unordered_map<int, int> sumCnt;
        sumCnt[0]++;
        int sum = 0;


        for (int i = 0; i < nums.size(); i++)
        {
            sum += nums[i];
            if (sumCnt.count(sum - k)) 
                count += sumCnt[sum-k];
            sumCnt[sum]++;
        }

        return count;

    }
};