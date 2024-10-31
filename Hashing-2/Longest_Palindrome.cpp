/*
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    int longestPalindrome(string s) {
        int ans=0;
        bool f = false;
        unordered_map<char, int> mp;
        for(char i: s){
            if(mp.find(i)!=mp.end()){
                mp[i]++;
            }
            else mp[i]++;
        }
        for(auto i: mp){
            if(i.second%2==0){
                ans+=i.second;
            }
            else if(!f){
                ans+=i.second;
                f = true;
            } else{
                ans = ans + i.second - 1;
            }
        }
        return ans;
    }
};