// Time Complexity: O(n)
// Space complexity: O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
// use hashset to maintain pairs, if we find the char again then increase length by 2 & remove char from the set, else keep adding to it
    int longestPalindrome(string s) {
        int count = 0;
        unordered_set<char> set;
        for(int i = 0; i < s.size(); i++) {
            char c = s.at(i);
            if(set.find(c) != set.end()) {
                count += 2;
                set.erase(c);
            }
            else set.insert(c);
        }
        // if there are chars in set, we can add any one char to our palindromic string
        if(set.size() != 0) count++;
        return count;
    }
};