//#include <hash_set>
 
class Solution {
public:
    int longestPalindrome(string s) {
         //edgee Case
        if(s.empty() || s.size() == 0) return 0;
        set<char> set;
        int count = 0;
        for(int i =0; i< s.size();i++){
            char c  = s[i];
            if(set.count(c)){
                count = count + 2;
                set.erase(c);
            }else{
                set.insert(c);
            }
        }
        if(!set.empty()) count++;
        return count;
    }
};


