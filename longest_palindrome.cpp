// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
class Solution {
public:
    int longestPalindrome(string s) {
        int count = 0;
        bool odd = false;
        unordered_map<char, int> mp;
        for( int i = 0; i < s.size(); i++) {
            mp[s[i]]++;
        }
        for(auto itr=mp.begin(); itr != mp.end(); itr++) {
            if(itr->second % 2 == 0) {
                count = count + itr->second;
            } else if(odd == true) {
                count = count + itr->second -1;
            
            } else {
                count = count + itr->second;
                odd = true;
            }
        }
        return count;
    }
};
