// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
public:
    int longestPalindrome(string s) {
        if(s.empty() || s.length() == 0){
            return 0;
        }
        unordered_set<char> set;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(set.find(s[i]) == set.end()){
                set.insert(s[i]);
            }
            else{
                max += 2;
                set.erase(s[i]);
            }
        }
        if(!set.empty()){
            max += 1;
        }
        return max;
    }
};
