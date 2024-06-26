// Longest Palindrome
// Approach: store char freq in a hash map. result = 1 initially (to satisfy just 1 char cases). add all even freqs to result and (freq-1) to result for odd cases. there will be a problem when there are only even freqs present. in that case we dont need that extra one. so maintain a flag which becomes true if there are odd freqs. return (result-1) if no odd freqs found to compensate for the initial 1.
// Time: O(n)
// Space: O(26+26) ~ O(1): bcoz only lower and upper case chars are present

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, int> umap;
        int result = 1;
        bool flag = false;
        for(char i : s) {
            umap[i]++;
        }
        for(auto i : umap) {
            if(i.second > 1) {
                if(i.second % 2 == 0) { // even freq
                    result += i.second;
                }
                else { // odd freq
                    flag = true;
                    result += (i.second - 1);
                }
            }
            else {
                flag = true;
            }
        }
        if(flag == false) {
            return (result - 1);
        }
        return result;
    }
};