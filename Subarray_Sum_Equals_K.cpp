/*
 *                  Subarray sum equal K
 *
 * Leetcode : https://leetcode.com/problems/longest-palindrome/ 
 * 
 * Time complexity : O(N)
 * Space complexity : O(N) 
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          - Using hashset, for having search operations in O(1)
 
 Personal notes : 
  
 Brute force approach creates nested loops. We can use one of the following approaches if 
 the brute force approach is leading to nested loops.
 1. Hashing
 2. Two pointers
 3. Binary Search
 4. Sliding Window
 5. Dynamic programming
 */
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> map;
        map[0] = 1;
        int count  = 0;
        int rSum = 0;

        for(int i = 0; i < nums.size(); i++) {
            rSum += nums[i];
            // Find Z = Current running sum - taregt
            if (map.find(rSum - k) != map.end()) {
                count += map[rSum-k];
            }
            // Insert in the map
            if (map.find(rSum) != map.end()) {
                map[rSum]++;
            } else {
                map[rSum] = 1;
            }
        }
        return count;
    }
};