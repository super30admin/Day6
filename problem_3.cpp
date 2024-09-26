/ Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int longestPalindrome(string s) {
        
        int len = 0;
        bool first_odd = true;
        unordered_map<char, int> umap;
        
        for (int i = 0; i < s.length(); i++) {
            umap[s[i]]++;
        }
        for (auto m : umap) {
            if (m.second % 2 != 0) {
                //odd number case
                if (first_odd) {
                    len += m.second;
                    first_odd = false;
                } else {
                    len += m.second - 1;
                }
            } else {
                //even case
                len += m.second;
            }
        }
        return len;
    }     
};
