//Time Complexity- O(n)
//Space Complexity- O(n)

class Solution {
public:
    int longestPalindrome(string s) {
        
        unordered_map<char,int> mp;
        int ans=0;
        
        for(char ch:s){
            mp[ch]++;
            if(mp[ch]==2){
                ans+=2;
                mp[ch]=0;
            }
        }
        return ((ans==s.size())?ans:ans+1);
    }
};