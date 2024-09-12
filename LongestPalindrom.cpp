class Solution {
public:
    int longestPalindrome(string s) {

        unordered_set<char> set;
        int count = 0;

        for(char c: set)
        {
            if(set.contains(c))
            {
                count +=2;
                set.erase(c);
            }
            else{
                set.insert(c);
            }
        }
        
        if(!set.empty()) count ++;

        return count;
    }
};