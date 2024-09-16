//Time Complexity = O(N)
//Space Complexity = O(N)
//Where N is the number of characters in the string.
class Solution {
public:
    int longestPalindrome(string s) {
        set<char> cc;
        int count=0;
        for(int i=0;i<s.size();i++)
        {
            if(cc.find(s[i])==cc.end())
                cc.insert(s[i]);
            else
            {
                cc.erase(s[i]);
                count+=2;
            }
        }
        if(!cc.empty())
            count+=1;
        return count;
    }
};
