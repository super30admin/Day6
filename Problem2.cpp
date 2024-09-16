//time complexity :o(n)
//space complexity : o(1);constant becuase only lower aplabet letters.
//Appraoch : using set it will store the character if present remove and add 2 to count.

class Solution {
public:
    int longestPalindrome(string s) {
        
        unordered_set<char> set;
        int count = 0;
         for(int i =0;i<s.length();i++) {
             
             if(set.find(s[i]) == set.end()) {
                 set.insert(s[i]);
             } else {
                 count = count + 2;
                 set.erase(s[i]);
             }
         }
        
        if(!set.empty()) {
            count += 1;
        }
        return count;
        
    }
};