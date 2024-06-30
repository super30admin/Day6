/*
 *                  Contiguous Array
 *
 * Leetcode : https://leetcode.com/problems/contiguous-array/description/ 
 * 
 * Time complexity : O(N)
 * Space complexity : O(N) 
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          - Maintaining running sum and hashmap of key as the earliest index of where the running 
 *            sum was equal to the calculated running sum.
 */

#include <vector>
#include <unordered_map>
#include <algorithm>
using namespace std;

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int, int> map;
        map[0] = -1;
        int rSum = 0;
        int maximum = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == 0) {
                rSum--;
            } else {
                rSum++;
            }

            if (map.find(rSum) != map.end()) {
                maximum = max(maximum, i - map[rSum]);
            } else {
                map[rSum] = i;
            }
        }
        return maximum;
    }
};
