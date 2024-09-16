// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : Algorithm wasn't very intuitive. Required LeetCode for reference


// Your code here along with comments explaining your approach

#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
        if (s.size() <= 1) return s.size();
        int count = 0, list[256] = { 0 };
        for (auto& c : s) list[c - '\0']++;
        for (auto& n : list) count += (n % 2)? n - 1 : n;
        return (count < s.size()) ? count + 1 : count;
    }
};