// Longest Palindrome


// Time Complexity : O(s)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes, it successfully ran on leetcode.
// Any problem you faced while coding this : Not really.


// Your code here along with comments explaining your approach
#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
         set<char> st;
        int count = 0;
       
        if(s.length() == 0) return 0;
        for(int i=0; i<s.length(); ++i)
        {
            if(st.find(s[i]) != st.end())
            {
                count+=2;
                st.erase(s[i]);
            }
            else{
                st.insert(s[i]);
            }
        }
        
        if(!st.empty())
        {
            count++;  
            
        }
        return count;
    }
};


// int main(){
    
//     return 0;
// }