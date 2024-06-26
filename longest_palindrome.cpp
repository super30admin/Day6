/*
 *                  Longest Palindrome
 *
 * Leetcode : https://leetcode.com/problems/longest-palindrome/ 
 * 
 * Time complexity : O(N)
 * Space complexity : O(N) 
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          - Using hashset, for having search operations in O(1)
 */

#include <unordered_set>
#include <string>
using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_set<char> charSet;
        int length = 0;
        
        for (char c : s) {
            if (charSet.find(c) != charSet.end()) {
                charSet.erase(c);
                length += 2;
            } else {
                charSet.insert(c);
            }
        }
        
        // If there's any character left in the set, it means we can place one of them in the center
        if (!charSet.empty()) {
            length += 1;
        }
        
        return length;
    }
};
