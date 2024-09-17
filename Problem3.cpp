// Time Complexity : O(n)
// Space Complexity : O(n) extra space used for Hash Set 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include<iostream>
#include<string>
#include<set>

using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
        if(s.empty())       // Null check
            return 0;
        
        int ctr = 0;
        set<char> s1;
        for(int i = 0; i < s.size(); i++){
            char c = s[i];
            if(s1.find(c) != s1.end()){
                s1.erase(c);
                ctr = ctr + 2;
            }else {
                s1.insert(c);
            }
        }

        if(!s1.empty()) // to add one more character to max length palindrome in case set is not empty
            ++ctr;
        
        return ctr;
    }
};