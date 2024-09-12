class Solution {
public:
    int longestPalindrome(string s) {
        //We need to add the alphabets in a hashmap and map them to their counts
        //Then we check whiever has an even count and add our count value to that
        if(s.size()==0) return 0;
        unordered_set<char>m;
        int count=0;
        for(int i=0;i<s.size();i++)
        {
            if(!m.count(s[i]))
                m.insert(s[i]);
            else
            {
                count=count+2;
                m.erase(s[i]);
            }
        }
        if(!m.empty())
            count++;
        return count;
    }
};