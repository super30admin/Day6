// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_set<char> p;
        int l = 0;
        for(int i = 0;i<s.length();i++){
            if(p.find(s[i])!=p.end()){
                l = l+2;
                p.erase(s[i]);
            }
            else{
                p.insert(s[i]);
            }
        }
        if(p.size()!=0){
            l = l+1;
        }
        return l;
    }
};
