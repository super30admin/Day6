class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char,int> um; 
        int len=0;
        for (auto x:s) {
            um[x]++;
            if (um[x]==2) {
                len+=2; //when the length is 2 then add that to the length
                um[x]=0; //reset the the value for that key to 0
            }
        }
        for (auto x:um) {
            if (x.second==1) { // this is an edge case where 1 char can be placed in the final string
                len++;
                break;
            }
        }
        return len;
    }
};