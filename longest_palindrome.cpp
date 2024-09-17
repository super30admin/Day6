//TC: O(n) where n is the number of letters in the string
//SC: O(n) 

class Solution {
public:
    int longestPalindrome(string s) {
        
        unordered_map<char, int> charMap;
        
        for(int i=0; i<s.size(); i++){
            charMap[s[i]] += 1;
        }
        
        int longest = 0;
        bool isOdd = false;
        
        //if the count of a character is even, add the count to longest, if odd then add odd-1. Also set a bool flag so that we know that there will be one central element if there is at least one odd number.
        for(int j=0; j<charMap.size(); j++){
            longest += (charMap[j]/2)*2;
            
            if(charMap[j]%2 == 1)
                isOdd = true;
        }
        
        if(isOdd)
            return longest + 1;
        
        return longest;
        
    }
};