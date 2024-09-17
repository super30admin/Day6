//
// Created by shazmaan on 7/9/2019.
//
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach, palindrome will have pairs on both sides, and then one element can be not in pair.
// Use sort for the alphabets and then check for pairs and add the number of pairs + unique element if existing.

#include <iostream>
#include <algorithm>
#include <map>
#include <vector>
#include <string>

using namespace std;

class Solution{
public:
    int longestPalindrome(string s) {
        int ret = 0; bool check = true; int x =0;
        sort(s.begin(),s.end());
        while(x<s.size()){
            if((x+1)<s.size() && s[x]==s[x+1]){
                ret+=2; x+=2;
            }else if(check){
                ret++; check=false;
            }else{
                x++;
            }
        }
        return ret;
    }
};

int main(){
    Solution s;
    cout<<s.longestPalindrome("aba");
    return 0;
}