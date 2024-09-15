// Time Complexity                              :  O(n)
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  Yes. Initially for the odd occuring letters, I took the one that has the longest length.
//                                                 I discarded the letters that are odd occuring but occur more than one. But Later the
//                                                 solution clicked. 

#include <bits/stdc++.h> 
using namespace std;  

class Solution {
public:
    int longestPalindrome(string s) {
        int mxo = INT_MIN;
        vector<int> ch(128,0);
        for(char c : s) {
            ch[c - 'A']++;
        }
        int len = 0;
        for(auto count : ch) {
            len += count / 2 * 2;
            if(len % 2 == 0 and count%2 == 1) len++;
        } 
        return len;
    }
};