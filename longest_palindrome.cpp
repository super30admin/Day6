
// Time Complexity : O(N)
// Space Complexity : O(1) = at max we'll have 52 + special characters for map
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : N/A

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, int> map; 

        int length = 0;
        for(char c: s)
        {
            map[c]++;
            if(map[c] == 2)
            {
                length +=2;
                map.erase(c);
            }
        }

        if(map.empty() == false)
        {
            length++;
        }

        return length;
    }
};