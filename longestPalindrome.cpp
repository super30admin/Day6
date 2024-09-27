//Time Complexity :O(N)  --- N is length of the string
// Space Complexity :O(1) -- size of the alphabet is fixed -- Max is 52.
// Did this code successfully run on Leetcode : It runs on the leetcode
// Any problem you faced while coding this :
I am learning hashSet for C++, figering out ways to use it while coding that is why I did not use the HashSet approach while solving the problem


// Your code here along with comments explaining your approach


class Solution {
public:
    int longestPalindrome(string s) {
        int count[128]  = {0};
        for(char c :s)
            count[c]++;
        
        int ans = 0;
        for (int v: count){
            ans += v/2 * 2;
            if(ans % 2 == 0 && v % 2 ==1)
                ans++;
        }
        return ans;
        
    }
};
