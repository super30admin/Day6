// Time Complexity : O(n+52)=>O(n), since we also traverse map after traversing string to find odd, even frequencies
// Space Complexity : O(52)=>O(1) since at max character can have 52 chars lower and uppercase combined
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, int> count_map;
        for (int i=0; i<s.length(); i++)
        {
            if(count_map.find(s[i])!=count_map.end())
                count_map[s[i]] += 1;
            else
                count_map.insert(make_pair(s[i], 1));
        }
        int max_len = 0;
        bool single_occ = false;
        for (auto entry: count_map)
        {
            if(entry.second%2 == 0)
                max_len+=entry.second;
            else {
                if(!single_occ)
                {
                    max_len+=entry.second;
                    single_occ=true;
                }
                else
                    max_len+=entry.second-1;
            }
        }
        return max_len;
    }
};