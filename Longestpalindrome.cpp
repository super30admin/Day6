// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_set<char> st;
        int cnt = 0;
        for (auto& c:s) {
            if (st.find(c)!=st.end()){
                cnt+=2;
                st.erase(c);
            }
            else{
                st.insert(c);
            }
        }
        if (!st.empty()) cnt++;
        return cnt;
    }
};